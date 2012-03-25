package com.jeecms.cms.manager.main;

import javax.servlet.http.HttpServletRequest;

import com.jeecms.cms.entity.main.CmsLog;
import com.jeecms.cms.entity.main.CmsUser;
import com.jeecms.common.page.Pagination;

public interface CmsLogMng {
	/**
	 * 已分页的方式返回日志记录
	 * @param category
	 * @param siteId
	 * @param username
	 * @param title
	 * @param ip
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public Pagination getPage(Integer category, Integer siteId,
			String username, String title, String ip, int pageNo, int pageSize);
	/**
	 * 通过id查询得到一条日志信息
	 * @param id
	 * @return
	 */
	public CmsLog findById(Integer id);
	/**
	 * 记录操作日志
	 * @param request
	 * @param title
	 * @param content
	 * @return
	 */
	public CmsLog operating(HttpServletRequest request, String title,
			String content);
	/**
	 * 登陆失败时记录登陆失败日志
	 * @param request
	 * @param title
	 * @param content
	 * @return
	 */
	public CmsLog loginFailure(HttpServletRequest request, String title,
			String content);
	/**
	 * 记录登陆成功日志
	 * @param request
	 * @param user
	 * @param title
	 * @return
	 */
	public CmsLog loginSuccess(HttpServletRequest request, CmsUser user,
			String title);
	/**
	 * 保持一条日志信息
	 * @param bean
	 * @return
	 */
	public CmsLog save(CmsLog bean);
	/**
	 * 通过id删除一条日志信息
	 * @param id
	 * @return
	 */
	public CmsLog deleteById(Integer id);

	/**
	 * 删除多条日志记录
	 * @param ids
	 * @return
	 */
	public CmsLog[] deleteByIds(Integer[] ids);

	/**
	 *批量删除
	 * @param category
	 * @param siteId
	 * @param days
	 * @return
	 */
	public int deleteBatch(Integer category, Integer siteId, Integer days);
}