package org.panda.domain;

import org.panda.domain.base.AbstractPandanSubscribeEmail;

/**
 * PandanSubscribeEmail entity. @author MyEclipse Persistence Tools
 */
public class PandanSubscribeEmail extends AbstractPandanSubscribeEmail
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandanSubscribeEmail() {
	}

	/** full constructor */
	public PandanSubscribeEmail(PandaSubscriber pandaSubscriber,
			PandaEnterprise pandaEnterprise) {
		super(pandaSubscriber, pandaEnterprise);
	}

}
