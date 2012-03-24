package org.panda.domain.base;

import java.sql.Timestamp;

import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaEmail entity provides the base persistence definition of the
 * PandaEmail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaEmail implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;
	private String emailSubject;
	private String emailContent;
	private String emaiAttachment;
	private String isTiming;
	private Timestamp sendTime;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public AbstractPandaEmail() {
	}

	/** minimal constructor */
	public AbstractPandaEmail(PandaUserInfo pandaUserInfo, String isTiming) {
		this.pandaUserInfo = pandaUserInfo;
		this.isTiming = isTiming;
	}

	/** full constructor */
	public AbstractPandaEmail(PandaUserInfo pandaUserInfo, String emailSubject,
			String emailContent, String emaiAttachment, String isTiming,
			Timestamp sendTime, Timestamp createTime) {
		this.pandaUserInfo = pandaUserInfo;
		this.emailSubject = emailSubject;
		this.emailContent = emailContent;
		this.emaiAttachment = emaiAttachment;
		this.isTiming = isTiming;
		this.sendTime = sendTime;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaUserInfo getPandaUserInfo() {
		return this.pandaUserInfo;
	}

	public void setPandaUserInfo(PandaUserInfo pandaUserInfo) {
		this.pandaUserInfo = pandaUserInfo;
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailContent() {
		return this.emailContent;
	}

	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	public String getEmaiAttachment() {
		return this.emaiAttachment;
	}

	public void setEmaiAttachment(String emaiAttachment) {
		this.emaiAttachment = emaiAttachment;
	}

	public String getIsTiming() {
		return this.isTiming;
	}

	public void setIsTiming(String isTiming) {
		this.isTiming = isTiming;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}