package org.panda.common.dao.test;

import org.junit.Test;
import org.panda.dao.PandaUserInfoDao;
import org.panda.domain.PandaUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.Assert;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
public class PandaUserDaoImplTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private PandaUserInfoDao userDao;

	public void setUserDao(PandaUserInfoDao userDao) {
		this.userDao = userDao;
	}

	@Test
	public void saveTest() throws Exception {
		PandaUserInfo pandaUserInfo = new PandaUserInfo();
		pandaUserInfo.setNickName("mn_1127");
		pandaUserInfo = this.userDao.save(pandaUserInfo);
		System.out.println(pandaUserInfo.getId());
		System.out.println(pandaUserInfo.getNickName());
		Assert.notNull(pandaUserInfo.getId());
		
	}
}
