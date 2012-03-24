package org.panda.domain;

import org.panda.domain.base.AbstractPandaRolePermission;

/**
 * PandaRolePermission entity. @author MyEclipse Persistence Tools
 */
public class PandaRolePermission extends AbstractPandaRolePermission implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaRolePermission() {
	}

	/** full constructor */
	public PandaRolePermission(PandaRole pandaRole, String url) {
		super(pandaRole, url);
	}

}
