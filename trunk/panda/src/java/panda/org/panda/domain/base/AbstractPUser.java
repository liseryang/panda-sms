package org.panda.domain.base;

/**
 * AbstractPUser entity provides the base persistence definition of the PUser
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;

	// Constructors

	/** default constructor */
	public AbstractPUser() {
	}

	/** full constructor */
	public AbstractPUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}