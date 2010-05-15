package org.mm.panda.core.manager.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.mm.panda.common.hibernate3.Updater;
import org.mm.panda.common.struts2.ContextPvd;
import org.mm.panda.common.util.PwdEncoder;
import org.mm.panda.core.CoreManagerImpl;
import org.mm.panda.core.dao.UserDao;
import org.mm.panda.core.entity.User;
import org.mm.panda.core.exception.UserRegisterException;
import org.mm.panda.core.manager.UserMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class UserMngImpl extends CoreManagerImpl<User> implements UserMng {

	@Autowired
	private PwdEncoder pwdEncoder;
	@Autowired
	private ContextPvd contextPvd;

	@Autowired
	public void setUserDao(UserDao userDao) {
		super.setDao(userDao);
	}

	protected UserDao getUserDao() {
		return (UserDao) super.getDao();
	}

	@Override
	public User authenticate(String loginName, String password) {
		User user = getByLoginName(loginName);
		if (user != null) {
			String md5Pwd = this.pwdEncoder.encodePassword(password);
			if (md5Pwd.equals(user.getPassword())) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean checkEmail(String email) {
		User u = getUserByEmail(email);
		return u == null ? true : false;
	}

	@Override
	public boolean checkLoginName(String loginName) {
		return getUserDao().countByProperty("loginName", loginName) <= 0 ? true
				: false;
	}

	@Override
	public User getByLoginName(String loginName) {
		return this.getUserDao().getUserByLoginName(loginName);
	}

	@Override
	public User getUserByEmail(String email) {
		return this.getUserDao().findUniqueByProperty("email", email);
	}

	@Override
	public User login(String loginName, String password) {
		User united = authenticate(loginName, password);
		updateLoginInfo(united);
		contextPvd.setSessionAttr(User.USER_KEY, united);
		return united;
	}

	@Override
	public User register(User user, boolean isExist)
			throws UserRegisterException {
		Assert.notNull(user,"用户实体不能为空");
		String loginName = user.getLoginName();
		Assert.hasText(loginName,"登录名不能为空！");
		User origUser = getByLoginName(loginName);
		if (isExist) {
			if (origUser == null) {
				throw new UserRegisterException("用户不存在！");
			}
			return origUser;
		} else {
			if (origUser != null) {
				throw new UserRegisterException("该用户名已注册！");
			}
			return save(user);
		}
	}

	@Override
	public void updateLoginInfo(User admin) {
		admin.setLastLoginTime(admin.getCurrentLoginTime());
		admin.setLastLoginIp(admin.getCurrentLoginIp());
		admin.setCurrentLoginTime(new java.sql.Timestamp(System
				.currentTimeMillis()));
		admin.setCurrentLoginIp(this.contextPvd.getRemoteIp());
		if (admin.getLoginCount() == null || admin.getLoginCount() < 0) {
			admin.setLoginCount(0L);
		}
		admin.setLoginCount(admin.getLoginCount() + 1);

	}

	@Override
	public void updatePassword(Integer id, String newPwd) {
		User user = findById(id);
		user.setPassword(pwdEncoder.encodePassword(newPwd));
		update(user);

	}

	@Override
	public boolean updatePwdEmail(User user, String oldPwd, String newPwd,
			String email) {
		if (!pwdEncoder.isPasswordValid(user.getPassword(), oldPwd)) {
			return false;
		}
		if (!StringUtils.isBlank(newPwd)) {
			user.setPassword(pwdEncoder.encodePassword(newPwd));
		}
		if (!StringUtils.isBlank(email)) {
			user.setEmail(email);
		}
		this.update(user);
		return true;
	}

	@Override
	public Object updateByUpdater(Updater updater) {
		User udt = (User) updater.getBean();
		// 密码加密
		String p = udt.getPassword();
		if (!StringUtils.isBlank(p)) {
			udt.setPassword(pwdEncoder.encodePassword(p));
		} else {
			udt.setPassword(null);
		}
		User after = (User) super.updateByUpdater(updater);
		return after;
	}

	@Override
	public User save(User user) {
		Assert.notNull(user);
		Assert.hasText(user.getLoginName(), "用户名不能为空！");
		Assert.hasText(user.getPassword(), "密码不能为空！");
		Assert.hasText(user.getEmail(), "邮件不能为空！");
		initUser(user);
		super.save(user);
		return user;
	}

	/**
	 * 初始化用户信息
	 */
	private void initUser(User user) {
		// 默认值处理
		user.setUnreadMsg(0);
		user.setDisabled(false);
		// 密码加密
		String p = pwdEncoder.encodePassword(user.getPassword());
		user.setPassword(p);
		// 即时信息
		// String ip = contextPvd.getRemoteIp();
		Date now = new Timestamp(System.currentTimeMillis());
		user.setCreateDate(now);
		// user.setCurrentLoginIp(ip);
		user.setCurrentLoginTime(now);
		// user.setLastLoginIp(ip);
		user.setLastLoginTime(now);
		user.setLoginCount(0L);
	}

	@Override
	public User findById(Serializable id) {
		User user = super.findById(id);
		return user;
	}

	@Override
	public User deleteById(Serializable id) {
		User user = super.deleteById(id);
		return user;
	}

	public void setPwdEncoder(PwdEncoder pwdEncoder) {
		this.pwdEncoder = pwdEncoder;
	}

	public void setContextPvd(ContextPvd contextPvd) {
		this.contextPvd = contextPvd;
	}
}
