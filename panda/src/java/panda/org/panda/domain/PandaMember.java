package org.panda.domain;

import org.panda.domain.base.AbstractPandaMember;

/**
 * PandaMember entity. @author MyEclipse Persistence Tools
 */
public class PandaMember extends AbstractPandaMember implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaMember() {
	}

	/** full constructor */
	public PandaMember(PandaUserInfo pandaUserInfo) {
		super(pandaUserInfo);
	}

}
