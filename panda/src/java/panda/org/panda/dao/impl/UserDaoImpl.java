package org.panda.dao.impl;

import org.panda.common.hibernate3.HibernateBaseDao;
import org.panda.dao.UserDao;
import org.panda.domain.PUser;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends HibernateBaseDao<PUser, Integer> implements
		UserDao {
	protected Class<PUser> getEntityClass() {
		return PUser.class;
	}
	public PUser save(PUser user) throws Exception {
		user.setUserName("liuyf");
		getSession().save(user);
		 throw new Exception();
	}

}
