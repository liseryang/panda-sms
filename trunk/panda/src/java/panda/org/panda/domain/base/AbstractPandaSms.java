package org.panda.domain.base;

import java.sql.Timestamp;

import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaSms entity provides the base persistence definition of the
 * PandaSms entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaSms implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;
	private String smsContent;
	private String isTime;
	private Timestamp sendTime;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public AbstractPandaSms() {
	}

	/** minimal constructor */
	public AbstractPandaSms(PandaUserInfo pandaUserInfo, String smsContent,
			String isTime) {
		this.pandaUserInfo = pandaUserInfo;
		this.smsContent = smsContent;
		this.isTime = isTime;
	}

	/** full constructor */
	public AbstractPandaSms(PandaUserInfo pandaUserInfo, String smsContent,
			String isTime, Timestamp sendTime, Timestamp createTime) {
		this.pandaUserInfo = pandaUserInfo;
		this.smsContent = smsContent;
		this.isTime = isTime;
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

	public String getSmsContent() {
		return this.smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public String getIsTime() {
		return this.isTime;
	}

	public void setIsTime(String isTime) {
		this.isTime = isTime;
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