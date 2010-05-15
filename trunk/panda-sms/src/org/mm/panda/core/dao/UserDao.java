package org.mm.panda.core.dao;

import org.mm.panda.core.CoreDao;
import org.mm.panda.core.entity.User;

public interface UserDao extends CoreDao<User> {
	/**
	 * 根据登录名查找用户。未找到返回null。
	 * 
	 * @param loginName
	 * @return
	 */
	public User getUserByLoginName(String loginName);
}
