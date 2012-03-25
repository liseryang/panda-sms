package com.jeecms.cms.manager.main;

import java.util.List;

import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.cms.entity.main.CmsUser;
import com.jeecms.cms.entity.main.CmsUserExt;
import com.jeecms.common.email.EmailSender;
import com.jeecms.common.email.MessageTemplate;
import com.jeecms.common.page.Pagination;

public interface CmsUserMng {
	/**
	 * 根据查询条件分页显示用户列表
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
	 * 根据查询条件显示所有符合条件的用户列表
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
	 * 查询得到所有管理人员的列表
	 * @param siteId
	 * @param allChannel
	 * @param disabled
	 * @param rank
	 * @return
	 */
	public List<CmsUser> getAdminList(Integer siteId, Boolean allChannel,
			Boolean disabled, Integer rank);

	/**
	 * 通过id查询得到一个会员信息
	 * @param id
	 * @return
	 */
	public CmsUser findById(Integer id);

	/**
	 * 通过用户名查询得到一个会员信息
	 * @param username
	 * @return
	 */
	public CmsUser findByUsername(String username);

	/**
	 * 添加一个会员信息，该方法一定要在一个事物中执行，因为它要对三张表进行操作，
	 * 分别为jc_user，
	 * jo_user，
	 * jc_user_ext
	 * @param username
	 * @param email
	 * @param password
	 * @param ip
	 * @param groupId
	 * @param userExt
	 * @return
	 */
	public CmsUser registerMember(String username, String email,
			String password, String ip, Integer groupId, CmsUserExt userExt);

	/**
	 *  添加一个会员信息，该方法一定要在一个事物中执行，因为它要对三张表进行操作，
	 *  * 分别为jc_user，
	 * jo_user，
	 * jc_user_ext
	 * @param username
	 * @param email
	 * @param password
	 * @param ip
	 * @param groupId
	 * @param userExt
	 * @param activation
	 * @param sender
	 * @param msgTpl
	 * @return
	 */
	public CmsUser registerMember(String username, String email,
			String password, String ip, Integer groupId, CmsUserExt userExt,
			Boolean activation, EmailSender sender, MessageTemplate msgTpl);

	/**
	 * 更新会员登录信息包括（最后登录时间，最后登录ip，登录次数）
	 * @param userId
	 * @param ip
	 */
	public void updateLoginInfo(Integer userId, String ip);

	/**
	 * 更新会员的上传文件的大小
	 * @param userId
	 * @param size
	 */
	public void updateUploadSize(Integer userId, Integer size);

	/**
	 * 更新会员的密码和邮箱
	 * @param id
	 * @param password
	 * @param email
	 */
	public void updatePwdEmail(Integer id, String password, String email);

	/**
	 * 验证指定会员的密码是否正确
	 * @param id
	 * @param password
	 * @return
	 */
	public boolean isPasswordValid(Integer id, String password);

	/**
	 * 添加一个系统管理人员
	 * @param username
	 * @param email
	 * @param password
	 * @param ip
	 * @param viewOnly
	 * @param selfAdmin
	 * @param rank
	 * @param groupId
	 * @param roleIds
	 * @param channelIds
	 * @param siteIds
	 * @param steps
	 * @param allChannels
	 * @param userExt
	 * @return
	 */
	public CmsUser saveAdmin(String username, String email, String password,
			String ip, boolean viewOnly, boolean selfAdmin, int rank,
			Integer groupId, Integer[] roleIds, Integer[] channelIds,
			Integer[] siteIds, Byte[] steps, Boolean[] allChannels,
			CmsUserExt userExt);

	/**
	 * 更新一个系统人员的信息
	 * @param bean
	 * @param ext
	 * @param password
	 * @param groupId
	 * @param roleIds
	 * @param channelIds
	 * @param siteIds
	 * @param steps
	 * @param allChannels
	 * @return
	 */
	public CmsUser updateAdmin(CmsUser bean, CmsUserExt ext, String password,
			Integer groupId, Integer[] roleIds, Integer[] channelIds,
			Integer[] siteIds, Byte[] steps, Boolean[] allChannels);

	/**
	 * 更新系统管理人员的信息
	 * @param bean
	 * @param ext
	 * @param password
	 * @param groupId
	 * @param roleIds
	 * @param channelIds
	 * @param siteId
	 * @param step
	 * @param allChannel
	 * @return
	 */
	public CmsUser updateAdmin(CmsUser bean, CmsUserExt ext, String password,
			Integer groupId, Integer[] roleIds, Integer[] channelIds,
			Integer siteId, Byte step, Boolean allChannel);

	/**
	 * 更新一个会员的信息
	 * @param id
	 * @param email
	 * @param password
	 * @param isDisabled
	 * @param ext
	 * @param groupId
	 * @return
	 */
	public CmsUser updateMember(Integer id, String email, String password,
			Boolean isDisabled, CmsUserExt ext, Integer groupId);

	/**
	 * 更新用户的收藏信息
	 * @param user
	 * @param cid
	 * @param operate
	 * @return
	 */
	public CmsUser updateUserConllection(CmsUser user, Integer cid,
			Integer operate);

	/**
	 * 
	 * @param user
	 * @param site
	 * @param checkStep
	 */
	public void addSiteToUser(CmsUser user, CmsSite site, Byte checkStep);

	/**
	 * 删除一个用户
	 * @param id
	 * @return
	 */
	public CmsUser deleteById(Integer id);

	/**
	 * 批量删除用户信息
	 * @param ids
	 * @return
	 */
	public CmsUser[] deleteByIds(Integer[] ids);

	/**
	 * 判断该用户名的用户是否存在
	 * @param username
	 * @return
	 */
	public boolean usernameNotExist(String username);

	/**
	 * 判断该用户名的会员是否存在
	 * @param username
	 * @return
	 */
	public boolean usernameNotExistInMember(String username);

	/**
	 * 判断该邮件是否已经注册了用户
	 * @param email
	 * @return
	 */
	public boolean emailNotExist(String email);
}