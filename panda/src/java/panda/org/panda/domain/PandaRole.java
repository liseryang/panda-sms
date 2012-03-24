package org.panda.domain;

import java.util.Set;

import org.panda.domain.base.AbstractPandaRole;

/**
 * PandaRole entity. @author MyEclipse Persistence Tools
 */
public class PandaRole extends AbstractPandaRole implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaRole() {
	}

	/** full constructor */
	public PandaRole(String roleName, Boolean isSuper, Integer priority,
			Set pandaRolePermissions, Set pandaUserRoles) {
		super(roleName, isSuper, priority, pandaRolePermissions, pandaUserRoles);
	}

}
