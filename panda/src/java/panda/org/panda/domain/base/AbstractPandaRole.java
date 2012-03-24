package org.panda.domain.base;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPandaRole entity provides the base persistence definition of the
 * PandaRole entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaRole implements java.io.Serializable {

	// Fields

	private Integer id;
	private String roleName;
	private Boolean isSuper;
	private Integer priority;
	private Set pandaRolePermissions = new HashSet(0);
	private Set pandaUserRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPandaRole() {
	}

	/** full constructor */
	public AbstractPandaRole(String roleName, Boolean isSuper,
			Integer priority, Set pandaRolePermissions, Set pandaUserRoles) {
		this.roleName = roleName;
		this.isSuper = isSuper;
		this.priority = priority;
		this.pandaRolePermissions = pandaRolePermissions;
		this.pandaUserRoles = pandaUserRoles;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Boolean getIsSuper() {
		return this.isSuper;
	}

	public void setIsSuper(Boolean isSuper) {
		this.isSuper = isSuper;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Set getPandaRolePermissions() {
		return this.pandaRolePermissions;
	}

	public void setPandaRolePermissions(Set pandaRolePermissions) {
		this.pandaRolePermissions = pandaRolePermissions;
	}

	public Set getPandaUserRoles() {
		return this.pandaUserRoles;
	}

	public void setPandaUserRoles(Set pandaUserRoles) {
		this.pandaUserRoles = pandaUserRoles;
	}

}