package com.jeecms.cms.dao.main;

import java.util.List;

import com.jeecms.cms.entity.main.CmsUser;
import com.jeecms.common.hibernate3.Updater;
import com.jeecms.common.page.Pagination;

/**
 * 用户DAO接口
 * 
 * @author liufang
 * 
 */
public interface CmsUserDao{
	/**
	 * 后台管理系统中，得到所有符合查询条件的会员列表，并且分页显示
	 * @param username
	 * @param email
	 * @param siteId
	 * @param groupId
	 * @param disabled
	 * @param admin
	 * @param rank
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public Pagination getPage(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank,
			int pageNo, int pageSize);
	/**
	 * 后台管理系统中，得到所有符合查询条件的会员列表
	 * @param username
	 * @param email
	 * @param siteId
	 * @param groupId
	 * @param disabled
	 * @param admin
	 * @param rank
	 * @return
	 */
	public List getList(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank);
	/**
	 * 后台管理系统中，得到所有符合查询条件且是管理员列表
	 * @param siteId
	 * @param allChannel
	 * @param disabled
	 * @param rank
	 * @return
	 */
	public List<CmsUser> getAdminList(Integer siteId, Boolean allChannel,
			Boolean disabled, Integer rank);

	public CmsUser findById(Integer id);

	public CmsUser findByUsername(String username);
	/**
	 * 得到相同用户名的数量
	 * @param username
	 * @return
	 */
	public int countByUsername(String username);
	/**
	 * 统计相同用户名且是管理员的数量
	 * @param username
	 * @return
	 */
	public int countMemberByUsername(String username);
	/**
	 * 统计相同email的会员数量
	 * @param email
	 * @return
	 */
	public int countByEmail(String email);
	/**
	 * 保存用户信息
	 * @param bean
	 * @return
	 */
	public CmsUser save(CmsUser bean);
	/**
	 * 更新一个用户的信息
	 * @param updater
	 * @return
	 */
	public CmsUser updateByUpdater(Updater<CmsUser> updater);
	/**
	 * 删除一个用户的信息
	 * @param id
	 * @return
	 */
	public CmsUser deleteById(Integer id);
}