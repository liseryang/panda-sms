package org.panda.domain.base;

import org.panda.domain.PandaMessage;
import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaSendMessage entity provides the base persistence definition of
 * the PandaSendMessage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaSendMessage implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfoByMsgReceiverUser;
	private PandaUserInfo pandaUserInfoByMsgSendUser;
	private PandaMessage pandaMessage;
	private Short msgStatus;
	private Integer msgBox;

	// Constructors

	/** default constructor */
	public AbstractPandaSendMessage() {
	}

	/** minimal constructor */
	public AbstractPandaSendMessage(PandaMessage pandaMessage) {
		this.pandaMessage = pandaMessage;
	}

	/** full constructor */
	public AbstractPandaSendMessage(
			PandaUserInfo pandaUserInfoByMsgReceiverUser,
			PandaUserInfo pandaUserInfoByMsgSendUser,
			PandaMessage pandaMessage, Short msgStatus, Integer msgBox) {
		this.pandaUserInfoByMsgReceiverUser = pandaUserInfoByMsgReceiverUser;
		this.pandaUserInfoByMsgSendUser = pandaUserInfoByMsgSendUser;
		this.pandaMessage = pandaMessage;
		this.msgStatus = msgStatus;
		this.msgBox = msgBox;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaUserInfo getPandaUserInfoByMsgReceiverUser() {
		return this.pandaUserInfoByMsgReceiverUser;
	}

	public void setPandaUserInfoByMsgReceiverUser(
			PandaUserInfo pandaUserInfoByMsgReceiverUser) {
		this.pandaUserInfoByMsgReceiverUser = pandaUserInfoByMsgReceiverUser;
	}

	public PandaUserInfo getPandaUserInfoByMsgSendUser() {
		return this.pandaUserInfoByMsgSendUser;
	}

	public void setPandaUserInfoByMsgSendUser(
			PandaUserInfo pandaUserInfoByMsgSendUser) {
		this.pandaUserInfoByMsgSendUser = pandaUserInfoByMsgSendUser;
	}

	public PandaMessage getPandaMessage() {
		return this.pandaMessage;
	}

	public void setPandaMessage(PandaMessage pandaMessage) {
		this.pandaMessage = pandaMessage;
	}

	public Short getMsgStatus() {
		return this.msgStatus;
	}

	public void setMsgStatus(Short msgStatus) {
		this.msgStatus = msgStatus;
	}

	public Integer getMsgBox() {
		return this.msgBox;
	}

	public void setMsgBox(Integer msgBox) {
		this.msgBox = msgBox;
	}

}