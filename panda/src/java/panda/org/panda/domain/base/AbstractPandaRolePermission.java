package org.panda.domain.base;

import org.panda.domain.PandaRole;

/**
 * AbstractPandaRolePermission entity provides the base persistence definition
 * of the PandaRolePermission entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaRolePermission implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private PandaRole pandaRole;
	private String url;

	// Constructors

	/** default constructor */
	public AbstractPandaRolePermission() {
	}

	/** full constructor */
	public AbstractPandaRolePermission(PandaRole pandaRole, String url) {
		this.pandaRole = pandaRole;
		this.url = url;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaRole getPandaRole() {
		return this.pandaRole;
	}

	public void setPandaRole(PandaRole pandaRole) {
		this.pandaRole = pandaRole;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}