package org.mm.panda.core.manager.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.mm.panda.common.hibernate3.Condition;
import org.mm.panda.common.hibernate3.OrderBy;
import org.mm.panda.common.page.Pagination;
import org.mm.panda.core.CoreManagerImpl;
import org.mm.panda.core.dao.AdminDao;
import org.mm.panda.core.entity.Admin;
import org.mm.panda.core.entity.User;
import org.mm.panda.core.exception.AdminDisabledException;
import org.mm.panda.core.exception.UserRegisterException;
import org.mm.panda.core.manager.AdminMng;
import org.mm.panda.core.manager.UserMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class AdminMngImpl extends CoreManagerImpl<Admin> implements AdminMng {

	@Autowired
	private UserMng userMng;

	@Autowired
	public void setAdminDao(AdminDao dao) {
		super.setDao(dao);
	}

	@Override
	public Admin getByUserId(Integer userId) {

		Admin admin = null;
		admin = getDao().getAdminByUser(userId);
		return admin;
	}

	@Override
	public Pagination getAll(int pageNo, int pageSize) {
		Admin admin = new Admin();
		return findByEg(admin, new Condition[] { OrderBy.desc("id") }, pageNo,
				pageSize);
	}

	protected AdminDao getDao() {
		return (AdminDao) super.getDao();
	}

	@Override
	public Admin getByLoginName(String loginName) {
		User user = this.userMng.getByLoginName(loginName);
		Admin admin = this.getByUserId(user.getId());
		return admin;
	}

	@Override
	public List<Admin> getListByUserId(Integer userId) {
		Admin admin = new Admin();
		User user = new User(userId);
		admin.setUser(user);
		return this.findByEgList(admin);
	}

	@Override
	public Admin getLoginAdmin(Integer adminId, Integer userId) {
		return this.getLoginAdmin(adminId, userId, null);
	}

	private Admin getLoginAdmin(Integer adminId, Integer userId,
			HttpSession session) {
		if (adminId == null || userId == null) {
			return null;
		}
		Admin admin = findById(adminId);
		if (admin != null && admin.getDisabled()) {
			throw new AdminDisabledException("管理员'"
					+ admin.getUser().getLoginName() + "'已经被禁用！");
		}
		return admin;
	}

	@Override
	public Admin register(User user, Admin admin, boolean isExist)
			throws UserRegisterException {
		Assert.notNull(user);
		Assert.notNull(admin);
		user = userMng.register(user, isExist);
		Admin oadmin = getByUserId(user.getId());
		if (oadmin != null) {
			return oadmin;
		} else {
			admin.setUser(user);
			return save(admin);
		}
	}

	@Override
	public Admin save(Admin admin) {
		initAdmin(admin);
		super.save(admin);
		return admin;
	}

	/**
	 * 初始化管理员
	 * 
	 * @param admin
	 */
	private void initAdmin(Admin admin) {
		admin.setDisabled(false);
		admin.setCreateDate(new Timestamp(System.currentTimeMillis()));
	}

	@Override
	public Admin findById(Serializable id) {
		Admin admin = super.findById(id);
		return admin;
	}

	@Override
	public Admin deleteById(Serializable id) {
		Admin admin = super.deleteById(id);
		return admin;
	}
}
