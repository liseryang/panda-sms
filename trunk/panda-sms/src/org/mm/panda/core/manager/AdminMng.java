package org.mm.panda.core.manager;

import java.util.List;

import org.mm.panda.common.page.Pagination;
import org.mm.panda.core.CoreManager;
import org.mm.panda.core.entity.Admin;
import org.mm.panda.core.entity.User;
import org.mm.panda.core.exception.UserRegisterException;

/**
 * 管理员manager接口
 * 
 * 
 */
public interface AdminMng extends CoreManager<Admin> {
	/**
	 * 通过统一用户ID获得管理员
	 * 
	 * @param webId
	 * @param userId
	 * @return
	 */
	public Admin getByUserId(Integer userId);

	/**
	 * 通过登录名查找管理员
	 * 
	 * @param webId
	 * @param loginName
	 * @return
	 */
	public Admin getByLoginName(String loginName);

	/**
	 * 获得某站点管理员
	 * 
	 * @param webId
	 * @return
	 */
	public Pagination getAll(int pageNo, int pageSize);

	/**
	 * 根据统一用户ID获得管理员列表
	 * 
	 * @param unitedId
	 * @return
	 */
	public List<Admin> getListByUserId(Integer userId);

	/**
	 * 获得登录状态的管理员
	 * 
	 * @param webId
	 * @param adminId
	 * @param userId
	 * @return
	 */
	public Admin getLoginAdmin(Integer adminId, Integer userId);


	/**
	 * 注册管理员
	 * 
	 * @param webId
	 * @param user
	 * @param admin
	 * @param isExist
	 * @return
	 * @throws UserRegisterException
	 */
	public Admin register(User user, Admin admin, boolean isExist)
			throws UserRegisterException;
}