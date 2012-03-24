package org.panda.domain;

import java.sql.Timestamp;
import java.util.Set;

import org.panda.domain.base.AbstractPandaMessage;

/**
 * PandaMessage entity. @author MyEclipse Persistence Tools
 */
public class PandaMessage extends AbstractPandaMessage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaMessage() {
	}

	/** minimal constructor */
	public PandaMessage(Timestamp sendTime) {
		super(sendTime);
	}

	/** full constructor */
	public PandaMessage(String msgTitle, String msgContent, Timestamp sendTime,
			Set pandaReceiverMessages, Set pandaSendMessages) {
		super(msgTitle, msgContent, sendTime, pandaReceiverMessages,
				pandaSendMessages);
	}

}
