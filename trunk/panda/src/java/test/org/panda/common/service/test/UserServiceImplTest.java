package org.panda.common.service.test;

import org.junit.Test;
import org.panda.domain.PUser;
import org.panda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
//@TransactionConfiguration(defaultRollback = false)
public class UserServiceImplTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private UserService service;
	public void setUserService(UserService service) {
		this.service = service;
	}
	@Test
	public void saveTest() throws Exception {
		this.service.save(new PUser());
	}
}
