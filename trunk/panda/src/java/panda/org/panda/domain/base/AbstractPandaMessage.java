package org.panda.domain.base;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPandaMessage entity provides the base persistence definition of the
 * PandaMessage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaMessage implements java.io.Serializable {

	// Fields

	private Integer id;
	private String msgTitle;
	private String msgContent;
	private Timestamp sendTime;
	private Set pandaReceiverMessages = new HashSet(0);
	private Set pandaSendMessages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPandaMessage() {
	}

	/** minimal constructor */
	public AbstractPandaMessage(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	/** full constructor */
	public AbstractPandaMessage(String msgTitle, String msgContent,
			Timestamp sendTime, Set pandaReceiverMessages, Set pandaSendMessages) {
		this.msgTitle = msgTitle;
		this.msgContent = msgContent;
		this.sendTime = sendTime;
		this.pandaReceiverMessages = pandaReceiverMessages;
		this.pandaSendMessages = pandaSendMessages;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMsgTitle() {
		return this.msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public Set getPandaReceiverMessages() {
		return this.pandaReceiverMessages;
	}

	public void setPandaReceiverMessages(Set pandaReceiverMessages) {
		this.pandaReceiverMessages = pandaReceiverMessages;
	}

	public Set getPandaSendMessages() {
		return this.pandaSendMessages;
	}

	public void setPandaSendMessages(Set pandaSendMessages) {
		this.pandaSendMessages = pandaSendMessages;
	}

}