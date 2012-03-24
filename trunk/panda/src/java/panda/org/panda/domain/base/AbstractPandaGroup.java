package org.panda.domain.base;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPandaGroup entity provides the base persistence definition of the
 * PandaGroup entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaGroup implements java.io.Serializable {

	// Fields

	private Integer id;
	private String groupName;
	private Integer groupType;
	private Integer groupPriority;
	private Short needCaptcha;
	private Short needCheck;
	private Short isDefGroup;
	private Set pandaUserInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPandaGroup() {
	}

	/** minimal constructor */
	public AbstractPandaGroup(String groupName, Integer groupType,
			Integer groupPriority, Short needCaptcha, Short needCheck,
			Short isDefGroup) {
		this.groupName = groupName;
		this.groupType = groupType;
		this.groupPriority = groupPriority;
		this.needCaptcha = needCaptcha;
		this.needCheck = needCheck;
		this.isDefGroup = isDefGroup;
	}

	/** full constructor */
	public AbstractPandaGroup(String groupName, Integer groupType,
			Integer groupPriority, Short needCaptcha, Short needCheck,
			Short isDefGroup, Set pandaUserInfos) {
		this.groupName = groupName;
		this.groupType = groupType;
		this.groupPriority = groupPriority;
		this.needCaptcha = needCaptcha;
		this.needCheck = needCheck;
		this.isDefGroup = isDefGroup;
		this.pandaUserInfos = pandaUserInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getGroupType() {
		return this.groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public Integer getGroupPriority() {
		return this.groupPriority;
	}

	public void setGroupPriority(Integer groupPriority) {
		this.groupPriority = groupPriority;
	}

	public Short getNeedCaptcha() {
		return this.needCaptcha;
	}

	public void setNeedCaptcha(Short needCaptcha) {
		this.needCaptcha = needCaptcha;
	}

	public Short getNeedCheck() {
		return this.needCheck;
	}

	public void setNeedCheck(Short needCheck) {
		this.needCheck = needCheck;
	}

	public Short getIsDefGroup() {
		return this.isDefGroup;
	}

	public void setIsDefGroup(Short isDefGroup) {
		this.isDefGroup = isDefGroup;
	}

	public Set getPandaUserInfos() {
		return this.pandaUserInfos;
	}

	public void setPandaUserInfos(Set pandaUserInfos) {
		this.pandaUserInfos = pandaUserInfos;
	}

}