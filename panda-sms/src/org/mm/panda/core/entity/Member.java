package org.mm.panda.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.mm.panda.core.entity.base.BaseEntity;

@Entity
@Table(name = "core_member")
public class Member extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 在session的保存的key。
	 */
	public static final String MEMBER_KEY = "_member_key";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	// fields
	@Column(name = "nickName")
	private java.lang.String nickName;
	@Column(name = "personalWebsite")
	private java.lang.String personalWebsite;
	@Column(name = "qq")
	private java.lang.String qq;
	@Column(name = "msn")
	private java.lang.String msn;
	@Column(name = "disabled")
	private java.lang.Boolean disabled;

	// many to one
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public java.lang.String getNickName() {
		return nickName;
	}

	public void setNickName(java.lang.String nickName) {
		this.nickName = nickName;
	}

	public java.lang.String getPersonalWebsite() {
		return personalWebsite;
	}

	public void setPersonalWebsite(java.lang.String personalWebsite) {
		this.personalWebsite = personalWebsite;
	}

	public java.lang.String getQq() {
		return qq;
	}

	public void setQq(java.lang.String qq) {
		this.qq = qq;
	}

	public java.lang.String getMsn() {
		return msn;
	}

	public void setMsn(java.lang.String msn) {
		this.msn = msn;
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
}
