package org.panda.domain.base;

import org.panda.domain.PandaRole;
import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaUserRole entity provides the base persistence definition of the
 * PandaUserRole entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaUserRole implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;
	private PandaRole pandaRole;

	// Constructors

	/** default constructor */
	public AbstractPandaUserRole() {
	}

	/** full constructor */
	public AbstractPandaUserRole(PandaUserInfo pandaUserInfo,
			PandaRole pandaRole) {
		this.pandaUserInfo = pandaUserInfo;
		this.pandaRole = pandaRole;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaUserInfo getPandaUserInfo() {
		return this.pandaUserInfo;
	}

	public void setPandaUserInfo(PandaUserInfo pandaUserInfo) {
		this.pandaUserInfo = pandaUserInfo;
	}

	public PandaRole getPandaRole() {
		return this.pandaRole;
	}

	public void setPandaRole(PandaRole pandaRole) {
		this.pandaRole = pandaRole;
	}

}