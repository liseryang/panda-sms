package org.panda.domain;

import org.panda.domain.base.AbstractPandanSubscribeSms;

/**
 * PandanSubscribeSms entity. @author MyEclipse Persistence Tools
 */
public class PandanSubscribeSms extends AbstractPandanSubscribeSms implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandanSubscribeSms() {
	}

	/** full constructor */
	public PandanSubscribeSms(PandaEnterprise pandaEnterprise,
			PandaSubscriber pandaSubscriber) {
		super(pandaEnterprise, pandaSubscriber);
	}

}
