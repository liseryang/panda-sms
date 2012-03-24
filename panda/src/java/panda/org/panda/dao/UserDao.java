package org.panda.dao;

import org.panda.domain.PUser;

public interface UserDao {
	public PUser save(PUser user)throws Exception;
}
