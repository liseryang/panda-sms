package org.panda.domain;

import org.panda.domain.base.AbstractPUser;

/**
 * PUser entity. @author MyEclipse Persistence Tools
 */
public class PUser extends AbstractPUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PUser() {
	}

	/** full constructor */
	public PUser(String userName, String password) {
		super(userName, password);
	}

}
