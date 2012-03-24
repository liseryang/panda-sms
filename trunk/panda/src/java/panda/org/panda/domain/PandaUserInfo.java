package org.panda.domain;

import java.sql.Timestamp;
import java.util.Set;

import org.panda.domain.base.AbstractPandaUserInfo;

/**
 * PandaUserInfo entity. @author MyEclipse Persistence Tools
 */
public class PandaUserInfo extends AbstractPandaUserInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaUserInfo() {
	}

	/** full constructor */
	public PandaUserInfo(PandaGroup pandaGroup, Short userType,
			String nickName, String userName, String password,
			String headPhoto, String userEmail, Timestamp registerTime,
			String registerIp, Timestamp lastLoginTime, String lastLoginIp,
			Long loginCount, Boolean isDisabled, Boolean activation,
			String activationCode, String resetKey, String resetPwd,
			Timestamp errorTime, Integer errorCount, String errorIp,
			String telephone, PandaSubscriber pandaSubscriber,
			Set pandaReceiverMessagesForMsgSendUser, Set pandaQueues,
			Set pandaUserRoles, Set pandaSendMessagesForMsgSendUser,
			PandaMember pandaMember,
			Set pandaReceiverMessagesForMsgReceiverUser,
			PandaEnterprise pandaEnterprise, Set pandaEmails, Set pandaSmses,
			Set pandaSendMessagesForMsgReceiverUser) {
		super(pandaGroup, userType, nickName, userName, password, headPhoto,
				userEmail, registerTime, registerIp, lastLoginTime,
				lastLoginIp, loginCount, isDisabled, activation,
				activationCode, resetKey, resetPwd, errorTime, errorCount,
				errorIp, telephone, pandaSubscriber,
				pandaReceiverMessagesForMsgSendUser, pandaQueues,
				pandaUserRoles, pandaSendMessagesForMsgSendUser, pandaMember,
				pandaReceiverMessagesForMsgReceiverUser, pandaEnterprise,
				pandaEmails, pandaSmses, pandaSendMessagesForMsgReceiverUser);
	}

}
