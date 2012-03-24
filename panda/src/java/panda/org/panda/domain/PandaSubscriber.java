package org.panda.domain;

import java.sql.Timestamp;
import java.util.Set;

import org.panda.domain.base.AbstractPandaSubscriber;

/**
 * PandaSubscriber entity. @author MyEclipse Persistence Tools
 */
public class PandaSubscriber extends AbstractPandaSubscriber implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaSubscriber() {
	}

	/** minimal constructor */
	public PandaSubscriber(PandaUserInfo pandaUserInfo) {
		super(pandaUserInfo);
	}

	/** full constructor */
	public PandaSubscriber(PandaUserInfo pandaUserInfo, String realName,
			Boolean gender, Timestamp birthday, String introduction,
			Set pandanSubscribeEmails, Set pandanSubscribeSmses) {
		super(pandaUserInfo, realName, gender, birthday, introduction,
				pandanSubscribeEmails, pandanSubscribeSmses);
	}

}
