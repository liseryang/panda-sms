package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseCmsLog;

public class CmsLog extends BaseCmsLog {
	private static final long serialVersionUID = 1L;
	/**
	 * 登陆成功日志
	 */
	public static final int LOGIN_SUCCESS = 1;//
	/**
	 * 登陆失败日志
	 */
	public static final int LOGIN_FAILURE = 2;//
	/**
	 * 操作日志
	 */
	public static final int OPERATING = 3;//

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsLog () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsLog (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsLog (
		java.lang.Integer id,
		java.lang.Integer category,
		java.util.Date time) {

		super (
			id,
			category,
			time);
	}

	/* [CONSTRUCTOR MARKER END] */

}