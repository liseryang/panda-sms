package org.panda.common.dao.test;

import org.junit.Test;
import org.panda.dao.UserDao;
import org.panda.domain.PUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
public class UserDaoImplTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Test
	public void saveTest() throws Exception {
		this.userDao.save(new PUser());
	}
}
