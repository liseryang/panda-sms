package org.panda.domain;

import org.panda.domain.base.AbstractPandaUserRole;

/**
 * PandaUserRole entity. @author MyEclipse Persistence Tools
 */
public class PandaUserRole extends AbstractPandaUserRole implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaUserRole() {
	}

	/** full constructor */
	public PandaUserRole(PandaUserInfo pandaUserInfo, PandaRole pandaRole) {
		super(pandaUserInfo, pandaRole);
	}

}
