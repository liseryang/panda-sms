package org.panda.service.impl;

import org.panda.dao.UserDao;
import org.panda.domain.PUser;
import org.panda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public PUser save(PUser user) throws Exception {
		this.userDao.save(user);
		return user;
	}

}
