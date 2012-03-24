package org.panda.domain;

import java.sql.Timestamp;

import org.panda.domain.base.AbstractPandaEmail;

/**
 * PandaEmail entity. @author MyEclipse Persistence Tools
 */
public class PandaEmail extends AbstractPandaEmail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaEmail() {
	}

	/** minimal constructor */
	public PandaEmail(PandaUserInfo pandaUserInfo, String isTiming) {
		super(pandaUserInfo, isTiming);
	}

	/** full constructor */
	public PandaEmail(PandaUserInfo pandaUserInfo, String emailSubject,
			String emailContent, String emaiAttachment, String isTiming,
			Timestamp sendTime, Timestamp createTime) {
		super(pandaUserInfo, emailSubject, emailContent, emaiAttachment,
				isTiming, sendTime, createTime);
	}

}
