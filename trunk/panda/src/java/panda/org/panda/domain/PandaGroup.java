package org.panda.domain;

import java.util.Set;

import org.panda.domain.base.AbstractPandaGroup;

/**
 * PandaGroup entity. @author MyEclipse Persistence Tools
 */
public class PandaGroup extends AbstractPandaGroup implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaGroup() {
	}

	/** minimal constructor */
	public PandaGroup(String groupName, Integer groupType,
			Integer groupPriority, Short needCaptcha, Short needCheck,
			Short isDefGroup) {
		super(groupName, groupType, groupPriority, needCaptcha, needCheck,
				isDefGroup);
	}

	/** full constructor */
	public PandaGroup(String groupName, Integer groupType,
			Integer groupPriority, Short needCaptcha, Short needCheck,
			Short isDefGroup, Set pandaUserInfos) {
		super(groupName, groupType, groupPriority, needCaptcha, needCheck,
				isDefGroup, pandaUserInfos);
	}

}
