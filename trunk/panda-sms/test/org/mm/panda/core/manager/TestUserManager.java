package org.mm.panda.core.manager;

import java.util.Date;

import org.junit.Test;
import org.mm.panda.core.dao.impl.AdminDaoImpl;
import org.mm.panda.core.dao.impl.FunctionDaoImpl;
import org.mm.panda.core.dao.impl.RoleDaoImpl;
import org.mm.panda.core.dao.impl.UserDaoImpl;
import org.mm.panda.core.entity.Admin;
import org.mm.panda.core.entity.Function;
import org.mm.panda.core.entity.Role;
import org.mm.panda.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath*:/applicationContext.xml" })
public class TestUserManager extends
		AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private AdminDaoImpl adminDaoImpl;

	@Autowired
	private UserDaoImpl userDaoImpl;
	@Autowired
	private FunctionDaoImpl functionDaoImpl;
	@Autowired
	private RoleDaoImpl roleDaoImpl;

	@Autowired
	private UserMng userMng;

	@SuppressWarnings("unchecked")
	@Test
	public void TestSaveUser() throws Exception {
		User user = new User();
		user.setLoginName("mn_1127");
		user.setPassword("123456");
		user.setEmail("mn_1127@126.com");
		user.setBirthday(new Date());
		this.userMng.save(user);
		// this.userDaoImpl.save(user);
		Role role = new Role();
		role.setName("测试");
		this.roleDaoImpl.save(role);
		Function function = new Function();
		function.setDescription("这是只是一些测试数据");
		this.functionDaoImpl.save(function);
		Admin admin = new Admin();
		admin.setCreateDate(new Date());
		admin.addToFunctions(function);
		admin.addToRoles(role);
		admin.setUser(user);
		admin.setDisabled(false);
		this.adminDaoImpl.save(admin);
		System.out.println("********************");

	}
}
