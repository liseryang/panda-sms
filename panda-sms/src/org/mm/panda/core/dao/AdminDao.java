package org.mm.panda.core.dao;

import org.mm.panda.core.CoreDao;
import org.mm.panda.core.entity.Admin;

public interface AdminDao extends CoreDao<Admin> {
	/**
	 * 通过统一用户ID获得管理员
	 * 
	 * @param webId
	 * @param unitedId
	 * @return
	 */
	public Admin getAdminByUser( Integer userId);
}
