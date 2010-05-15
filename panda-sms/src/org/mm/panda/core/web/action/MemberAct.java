package org.mm.panda.core.web.action;

import org.mm.panda.core.CoreBaseAction;
import org.mm.panda.core.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;

@SuppressWarnings("serial")
@Scope("prototype")
@Controller("core.memberAct")
public class MemberAct extends CoreBaseAction {

	private static final Logger log = LoggerFactory.getLogger(RoleAct.class);

	private Member bean;

	public String list() {
		this.pagination = memberMng.findAll(pageNo, getCookieCount());
		return LIST;
	}

	public String add() {
		return ADD;
	}

	public String save() {
		memberMng.save(bean);
		return add();
	}

	public String edit() {
		this.bean = memberMng.findById(id);
		return EDIT;
	}

	public String update() {
		memberMng.updateDefault(bean);
		addActionMessage("修改成功");
		log.info("修改成功");
		return list();
	}

	public String delete() {
		try {
			memberMng.deleteById(id);
			memberMng.deleteById(ids);
		} catch (DataIntegrityViolationException e) {
			addActionError("记录已被引用，不能删除!");
		}
		return list();
	}

	public Member getBean() {
		return bean;
	}

	public void setBean(Member bean) {
		this.bean = bean;
	}
}
