package org.panda.domain;

import org.panda.domain.base.AbstractPandaQueue;

/**
 * PandaQueue entity. @author MyEclipse Persistence Tools
 */
public class PandaQueue extends AbstractPandaQueue implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaQueue() {
	}

	/** full constructor */
	public PandaQueue(PandaUserInfo pandaUserInfo, PandaCard pandaCard,
			Short isReturn) {
		super(pandaUserInfo, pandaCard, isReturn);
	}

}
