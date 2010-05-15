package org.mm.panda.core.entity;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.mm.panda.common.util.PriorityInterface;
import org.mm.panda.common.util.SelectTree;
import org.mm.panda.core.entity.base.BaseEntity;

@Entity
@Table(name = "core_function")
public class Function extends BaseEntity implements SelectTree,
		PriorityInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private java.lang.String name;
	@Column(name = "url")
	private java.lang.String url;
	@Column(name = "funcs")
	private java.lang.String funcs;
	@Column(name = "description")
	private java.lang.String description;
	@Column(name = "priority")
	private java.lang.Integer priority;
	@Column(name = "menu")
	private java.lang.Boolean menu;

	// many to one
	@JoinColumn(name = "parent_id", referencedColumnName = "id")
	@ManyToOne
	private Function parent;

	// collections
	@ManyToMany(mappedBy = "functions", fetch = FetchType.LAZY)
	private Set<Admin> admins;
	@JoinTable(name = "core_role_function", joinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "function_id", referencedColumnName = "id") })
	@ManyToMany
	private Set<Role> roles;
	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
	private Set<Function> child;

	/**
	 * 功能集的分隔符
	 */
	public static final String FUNC_SPLIT = "@";
	/**
	 * 下拉列表树
	 */
	private String selectTree;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Function() {

	}

	/**
	 * Constructor for primary key
	 */
	public Function(Integer id) {
		this.id = id;
	}

	/**
	 * Constructor for required fields
	 */
	public Function(Integer id, Integer priority, Boolean menu) {
		this.id = id;
		this.setPriority(priority);
		this.setMenu(menu);
	}

	/* [CONSTRUCTOR MARKER END] */

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getUrl() {
		return url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	public java.lang.String getFuncs() {
		return funcs;
	}

	public void setFuncs(java.lang.String funcs) {
		this.funcs = funcs;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.Integer getPriority() {
		return priority;
	}

	public void setPriority(java.lang.Integer priority) {
		this.priority = priority;
	}

	public java.lang.Boolean getMenu() {
		return menu;
	}

	public void setMenu(java.lang.Boolean menu) {
		this.menu = menu;
	}

	public Function getParent() {
		return parent;
	}

	public void setParent(Function parent) {
		this.parent = parent;
	}

	public Set<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<Admin> admins) {
		this.admins = admins;
	}

	public void addToAdmins(Admin admin) {
		if (null == getAdmins()) {
			setAdmins(new java.util.TreeSet<Admin>());
		}
		getAdmins().add(admin);
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void addToRoles(Role role) {
		if (null == getRoles()) {
			setRoles(new java.util.TreeSet<Role>());
		}
		getRoles().add(role);
	}

	public Set<Function> getChild() {
		return child;
	}

	public void setChild(Set<Function> child) {
		this.child = child;
	}

	@Override
	public String getSelectTree() {
		return this.selectTree;
	}

	@Override
	public Set<? extends SelectTree> getTreeChild() {
		return this.getChild();
	}

	@Override
	public Set<? extends SelectTree> getTreeChildRaw() {
		return null;
	}

	@Override
	public String getTreeName() {
		return this.getName();
	}

	@Override
	public SelectTree getTreeParent() {
		return this.getParent();
	}

	@Override
	public void setSelectTree(String selectTree) {
		this.selectTree = selectTree;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setTreeChild(Set treeChild) {
		// do something
	}

	public void addToChild(Function function) {
		if (null == getChild())
			setChild(new java.util.TreeSet<Function>());
		getChild().add(function);
	}

	@Override
	public Integer getId() {

		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
