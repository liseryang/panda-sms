package org.mm.panda.core.web.action;

import org.apache.commons.lang.StringUtils;
import org.mm.panda.common.hibernate3.OrderBy;
import org.mm.panda.core.CoreBaseAction;
import org.mm.panda.core.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;

@SuppressWarnings("serial")
@Scope("prototype")
@Controller("core.userAct")
public class UserAct extends CoreBaseAction {
	private static final Logger log = LoggerFactory.getLogger(UserAct.class);

	private User bean;
	private String username;
	private String email;

	public String list() {
		this.pagination = userMng.findAll(pageNo, getCookieCount(),
				new OrderBy[] { OrderBy.desc("id") });
		return LIST;
	}

	public String add() {
		return ADD;
	}

	public String save() {
		userMng.save(bean);
		log.info("添加 用户 成功：{}" + bean.getLoginName());
		return list();
	}

	public String edit() {
		this.bean = userMng.findById(id);
		return EDIT;
	}

	public String update() {
		userMng.updateDefault(bean);
		log.info("修改 用户 成功：{}" + bean.getLoginName());
		return list();
	}

	public String delete() {
		try {
			for (User o : userMng.deleteById(ids)) {
				log.info("删除  用户 成功:{}", o.getLoginName());
			}
		} catch (DataIntegrityViolationException e) {
			addActionError("记录已被引用，不能删除!");
			return SHOW_ERROR;
		}
		return list();
	}

	public String editPassword() {
		return "editPassword";
	}

	/**
	 * 后台管理用户验证
	 * 
	 * @return
	 */
	public String checkUsername() {
		if (StringUtils.isBlank(username)) {
			return renderText("false");
		}
		return renderText(userMng.checkLoginName(username) ? "true" : "false");
	}

	/**
	 * 后台管理邮件验证
	 * 
	 * @return
	 */
	public String checkEmail() {
		if (StringUtils.isBlank(email)) {
			return renderText("false");
		}
		return renderText(userMng.checkEmail(email) ? "true" : "false");
	}

	public boolean validateSave() {
		if (hasErrors()) {
			return true;
		}
		return false;
	}

	public boolean validateEdit() {
		if (hasErrors()) {
			return true;
		}
		if (vldExist(id)) {
			return true;
		}
		return false;
	}

	public boolean validateUpdate() {
		if (hasErrors()) {
			return true;
		}
		if (vldExist(bean.getId())) {
			return true;
		}
		return false;
	}

	public boolean validateDelete() {
		if (hasErrors()) {
			return true;
		}
		if (vldBatch()) {
			return true;
		}
		for (Integer id : ids) {
			if (id.equals(1)) {
				addActionError("超级管理员不能删除");
				return true;
			}
			if (vldExist(id)) {
				return true;
			}
		}
		return false;
	}

	private boolean vldExist(Integer id) {
		User entity = userMng.findById(id);
		if (entity == null) {
			addActionError("记录不存在：" + id);
			return true;
		}
		return false;
	}

	public User getBean() {
		return bean;
	}

	public void setBean(User bean) {
		this.bean = bean;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
