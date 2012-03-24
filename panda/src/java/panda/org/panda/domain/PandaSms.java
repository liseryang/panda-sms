package org.panda.domain;

import java.sql.Timestamp;

import org.panda.domain.base.AbstractPandaSms;

/**
 * PandaSms entity. @author MyEclipse Persistence Tools
 */
public class PandaSms extends AbstractPandaSms implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaSms() {
	}

	/** minimal constructor */
	public PandaSms(PandaUserInfo pandaUserInfo, String smsContent,
			String isTime) {
		super(pandaUserInfo, smsContent, isTime);
	}

	/** full constructor */
	public PandaSms(PandaUserInfo pandaUserInfo, String smsContent,
			String isTime, Timestamp sendTime, Timestamp createTime) {
		super(pandaUserInfo, smsContent, isTime, sendTime, createTime);
	}

}
