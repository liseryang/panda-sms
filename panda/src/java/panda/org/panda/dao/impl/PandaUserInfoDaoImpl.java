package org.panda.dao.impl;

import org.panda.common.hibernate3.HibernateBaseDao;
import org.panda.dao.PandaUserInfoDao;
import org.panda.domain.PandaUserInfo;
import org.springframework.stereotype.Repository;

/**
 * 认证用户信息Dao接口实现
 * 
 * @author: liuyf
 * @since: 2012-3-24 下午3:05:15
 * @history:
 ************************************************ 
 * @file: PandaUserInfoDao.java
 * @Copyright: 2008 HundSun Electronics Co.,Ltd. All right reserved.
 *********************************************** 
 */
@Repository
public class PandaUserInfoDaoImpl extends
		HibernateBaseDao<PandaUserInfo, Integer> implements PandaUserInfoDao {

	@Override
	protected Class<PandaUserInfo> getEntityClass() {
		return PandaUserInfo.class;
	}

	@Override
	public PandaUserInfo save(PandaUserInfo pandaUserInfo) {
		getSession().save(pandaUserInfo);
		return pandaUserInfo;
	}

	@Override
	public PandaUserInfo findById(Integer id) {
		return this.get(id);
	}

	@Override
	public PandaUserInfo findByUserName(String userName) {
		return findUniqueByProperty("userName", userName);
	}

	@Override
	public PandaUserInfo deleteById(Integer id) {
		PandaUserInfo pandaUserInfo = super.get(id);
		getSession().delete(pandaUserInfo);
		return pandaUserInfo;
	}

}
