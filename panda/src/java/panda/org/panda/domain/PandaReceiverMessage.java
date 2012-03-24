package org.panda.domain;

import org.panda.domain.base.AbstractPandaReceiverMessage;

/**
 * PandaReceiverMessage entity. @author MyEclipse Persistence Tools
 */
public class PandaReceiverMessage extends AbstractPandaReceiverMessage
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaReceiverMessage() {
	}

	/** minimal constructor */
	public PandaReceiverMessage(PandaMessage pandaMessage) {
		super(pandaMessage);
	}

	/** full constructor */
	public PandaReceiverMessage(PandaUserInfo pandaUserInfoByMsgReceiverUser,
			PandaUserInfo pandaUserInfoByMsgSendUser,
			PandaMessage pandaMessage, Short msgStatus, Integer msgBox) {
		super(pandaUserInfoByMsgReceiverUser, pandaUserInfoByMsgSendUser,
				pandaMessage, msgStatus, msgBox);
	}

}
