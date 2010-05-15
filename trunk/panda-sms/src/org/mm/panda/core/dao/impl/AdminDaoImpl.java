package org.mm.panda.core.dao.impl;

import org.mm.panda.core.CoreDaoImpl;
import org.mm.panda.core.dao.AdminDao;
import org.mm.panda.core.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl extends CoreDaoImpl<Admin> implements AdminDao {

	@Override
	public Admin getAdminByUser(Integer userId) {
		String hql = "from Admin u where u.user.id=?";
		return (Admin) findUnique(hql, userId);
	}

}
