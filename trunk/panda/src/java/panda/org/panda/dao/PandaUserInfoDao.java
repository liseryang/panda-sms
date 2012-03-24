package org.panda.dao;

import org.panda.common.hibernate3.Updater;
import org.panda.domain.PandaUserInfo;
/**
 * 认证用户信息Dao接口
 * 
 * @author: liuyf
 * @since: 2012-3-24 下午3:05:15
 * @history:
 ************************************************ 
 * @file: PandaUserInfoDao.java
 * @Copyright: 2008 HundSun Electronics Co.,Ltd. All right reserved.
 *********************************************** 
 */
public interface PandaUserInfoDao {

	/**
	 *添加一個用戶
	 * @param pandaUserInfo
	 * @return
	 * @create 2012-3-24 下午4:21:02 Administrator
	 * @history
	 */
	public PandaUserInfo save(PandaUserInfo pandaUserInfo);

	/**
	 * 通過id查詢用戶信息
	 * @param id
	 * @return
	 * @create 2012-3-24 下午4:21:07 Administrator
	 * @history
	 */
	public PandaUserInfo findById(Integer id);

	/**
	 * 通過用戶名查找用戶信息
	 * @param userName
	 * @return
	 * @create 2012-3-24 下午4:21:15 Administrator
	 * @history
	 */
	public PandaUserInfo findByUserName(String userName);

	/**
	 * 更新一個用戶信息
	 * @param updater
	 * @return
	 * @create 2012-3-24 下午4:21:20 Administrator
	 * @history
	 */
	public PandaUserInfo updateByUpdater(Updater<PandaUserInfo> updater);

	/**
	 * 通过id删除一个用户
	 * @param id
	 * @return 
	* @create  2012-3-24 下午4:22:07 Administrator
	* @history
	 */
	public PandaUserInfo deleteById(Integer id);

}
