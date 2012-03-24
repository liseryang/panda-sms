package org.panda.domain.base;

import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaMember entity provides the base persistence definition of the
 * PandaMember entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaMember implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;

	// Constructors

	/** default constructor */
	public AbstractPandaMember() {
	}

	/** full constructor */
	public AbstractPandaMember(PandaUserInfo pandaUserInfo) {
		this.pandaUserInfo = pandaUserInfo;
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

}