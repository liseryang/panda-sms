package org.mm.panda.core.entity;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.mm.panda.core.entity.base.BaseEntity;

@Entity
@Table(name = "core_admin")
public class Admin extends BaseEntity {
	/**
	 * 系统超级管理员
	 */
	private static final long serialVersionUID = 1L;

	private long functionExpired = 0;

	/**
	 * 功能列表失效时间
	 */
	private static long FUNCTION_EXPIRED = 0;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@Column(name = "disabled")
	private java.lang.Boolean disabled;

	// many to one
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne
	private User user;

	// many to many
	@JoinTable(name = "core_admin_role", joinColumns = { @JoinColumn(name = "admin_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") })
	@ManyToMany
	private Set<Role> roles;

	@JoinTable(name = "core_admin_function", joinColumns = { @JoinColumn(name = "admin_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "function_id", referencedColumnName = "id") })
	@ManyToMany
	private Set<Function> functions;

	/**
	 * 更新过期时间
	 */
	public void updateFuncExpired() {
		this.functionExpired = System.currentTimeMillis();
	}

	public static void funcChange() {
		FUNCTION_EXPIRED = System.currentTimeMillis();
	}

	public java.lang.Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(java.lang.Boolean disabled) {
		this.disabled = disabled;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void addToRoles(Role role) {
		if (null == getRoles())
			setRoles(new java.util.TreeSet<Role>());
		getRoles().add(role);
	}

	public Set<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(Set<Function> functions) {
		this.functions = functions;

	}

	public void addToFunctions(Function function) {
		if (null == getFunctions())
			setFunctions(new java.util.TreeSet<Function>());
		getFunctions().add(function);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
