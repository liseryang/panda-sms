package org.panda.web;

import org.panda.domain.PandaUserInfo;

/**
 * Panda线程变量
 * 
 * @author liuyf
 * 
 */
public class CmsThreadVariable {
	/**
	 * 当前用户线程变量
	 */
	private static ThreadLocal<PandaUserInfo> cmsUserVariable = new ThreadLocal<PandaUserInfo>();

	/**
	 * 获得当前用户
	 * 
	 * @return
	 */
	public static PandaUserInfo getUser() {
		return cmsUserVariable.get();
	}

	/**
	 * 设置当前用户
	 * 
	 * @param user
	 */
	public static void setUser(PandaUserInfo user) {
		cmsUserVariable.set(user);
	}

	/**
	 * 移除当前用户
	 */
	public static void removeUser() {
		cmsUserVariable.remove();
	}

	
}
