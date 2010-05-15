package org.mm.panda.core.dao.impl;

import org.mm.panda.core.CoreDaoImpl;
import org.mm.panda.core.dao.UserDao;
import org.mm.panda.core.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends CoreDaoImpl<User> implements UserDao {

	@Override
	public User getUserByLoginName(String loginName) {
		return this.findUniqueByProperty("loginName", loginName);
	}

}
