package org.mm.panda.core.dao;

import java.util.Date;

import org.junit.Test;
import org.mm.panda.common.hibernate3.BaseDaoImpl;
import org.mm.panda.core.dao.impl.AdminDaoImpl;
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
	private BaseDaoImpl baseDaoImpl;

	@SuppressWarnings("unchecked")
	@Test
	public void TestSaveUser() throws Exception {
		User user = new User();
		user.setBirthday(new Date());
		this.baseDaoImpl.save(user);
		Role role = new Role();
		role.setName("测试");
		this.baseDaoImpl.save(role);
		Function function = new Function();
		function.setDescription("这是只是一些测试数据");
		this.baseDaoImpl.save(function);
		Admin admin = new Admin();
		admin.setCreateDate(new Date());
		admin.addToFunctions(function);
		admin.addToRoles(role);
		admin.setUser(user);
		admin.setDisabled(false);
		this.adminDaoImpl.save(admin);
		System.out.println("********************");
	}

	public void setAdminDaoImpl(AdminDaoImpl adminDaoImpl) {
		this.adminDaoImpl = adminDaoImpl;
	}

	public void setBaseDaoImpl(BaseDaoImpl baseDaoImpl) {
		this.baseDaoImpl = baseDaoImpl;
	}

}
