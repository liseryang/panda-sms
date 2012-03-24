package org.panda.dao.impl;

import org.apache.commons.lang.StringUtils;
import org.panda.common.hibernate3.Finder;
import org.panda.common.hibernate3.HibernateBaseDao;
import org.panda.common.page.Pagination;
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

	@Override
	public Pagination getPage(String username, String userEmail,
			Integer groupId, Integer userType, Boolean disabled, int pageNo,
			int pageSize) {
		Finder f = Finder.create("select bean from PandaUserInfo bean");
		if (groupId != null) {
			f.append(" where bean.group.id:groupId");
			f.setParam("groupId", groupId);
		} else {
			f.append(" where 1=1");
		}
		if (!StringUtils.isBlank(username)) {
			f.append(" and bean.userName like :username");
			f.setParam("username", "%" + username + "%");
		}
		if (!StringUtils.isBlank(userEmail)) {
			f.append(" and bean.userEmail like :email");
			f.setParam("email", "%" + userEmail + "%");
		}
		
		if (disabled != null) {
			f.append(" and bean.isDisabled=:disabled");
			f.setParam("disabled", disabled);
		}
		if (userType != null) {
			f.append(" and bean.userType=:userType");
			f.setParam("userType", userType);
		}
		f.append(" order by bean.id desc");
		return find(f, pageNo, pageSize);
	}

}
