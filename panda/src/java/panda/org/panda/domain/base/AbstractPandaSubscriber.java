package org.panda.domain.base;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaSubscriber entity provides the base persistence definition of
 * the PandaSubscriber entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaSubscriber implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;
	private String realName;
	private Boolean gender;
	private Timestamp birthday;
	private String introduction;
	private Set pandanSubscribeEmails = new HashSet(0);
	private Set pandanSubscribeSmses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPandaSubscriber() {
	}

	/** minimal constructor */
	public AbstractPandaSubscriber(PandaUserInfo pandaUserInfo) {
		this.pandaUserInfo = pandaUserInfo;
	}

	/** full constructor */
	public AbstractPandaSubscriber(PandaUserInfo pandaUserInfo,
			String realName, Boolean gender, Timestamp birthday,
			String introduction, Set pandanSubscribeEmails,
			Set pandanSubscribeSmses) {
		this.pandaUserInfo = pandaUserInfo;
		this.realName = realName;
		this.gender = gender;
		this.birthday = birthday;
		this.introduction = introduction;
		this.pandanSubscribeEmails = pandanSubscribeEmails;
		this.pandanSubscribeSmses = pandanSubscribeSmses;
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

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Set getPandanSubscribeEmails() {
		return this.pandanSubscribeEmails;
	}

	public void setPandanSubscribeEmails(Set pandanSubscribeEmails) {
		this.pandanSubscribeEmails = pandanSubscribeEmails;
	}

	public Set getPandanSubscribeSmses() {
		return this.pandanSubscribeSmses;
	}

	public void setPandanSubscribeSmses(Set pandanSubscribeSmses) {
		this.pandanSubscribeSmses = pandanSubscribeSmses;
	}

}