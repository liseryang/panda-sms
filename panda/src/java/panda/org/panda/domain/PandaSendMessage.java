package org.panda.domain;

import org.panda.domain.base.AbstractPandaSendMessage;

/**
 * PandaSendMessage entity. @author MyEclipse Persistence Tools
 */
public class PandaSendMessage extends AbstractPandaSendMessage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaSendMessage() {
	}

	/** minimal constructor */
	public PandaSendMessage(PandaMessage pandaMessage) {
		super(pandaMessage);
	}

	/** full constructor */
	public PandaSendMessage(PandaUserInfo pandaUserInfoByMsgReceiverUser,
			PandaUserInfo pandaUserInfoByMsgSendUser,
			PandaMessage pandaMessage, Short msgStatus, Integer msgBox) {
		super(pandaUserInfoByMsgReceiverUser, pandaUserInfoByMsgSendUser,
				pandaMessage, msgStatus, msgBox);
	}

}
