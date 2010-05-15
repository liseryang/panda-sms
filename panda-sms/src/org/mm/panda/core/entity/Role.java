package org.mm.panda.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.mm.panda.core.entity.base.BaseEntity;

@Entity
@Table(name = "core_role")
public class Role extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	
	// fields
	@Column(name = "name")
	private java.lang.String name;
	@Column(name = "description")
	private java.lang.String description;

	// collections
	@ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
	private java.util.Set<Admin> admins;
	@ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
	private java.util.Set<Function> functions;

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.util.Set<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(java.util.Set<Admin> admins) {
		this.admins = admins;
	}

	public void addToAdmins(Admin admin) {
		if (null == getAdmins())
			setAdmins(new java.util.TreeSet<Admin>());
		getAdmins().add(admin);
	}

	public java.util.Set<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(java.util.Set<Function> functions) {
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
