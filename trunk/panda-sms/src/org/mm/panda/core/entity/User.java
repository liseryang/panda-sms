package org.mm.panda.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.mm.panda.core.entity.base.BaseEntity;

@Entity
@Table(name = "core_user")
public class User extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 在session的保存的key。
	 */
	public static final String USER_KEY = "_user_key";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Column(name = "login_name")
	private java.lang.String loginName;
	@Column(name = "real_name")
	private java.lang.String realName;
	@Column(name = "password")
	private java.lang.String password;
	@Column(name = "email")
	private java.lang.String email;
	@Column(name = "unreadMsg")
	private java.lang.Integer unreadMsg;
	@Column(name = "fax")
	private java.lang.String fax;
	@Column(name = "tel")
	private java.lang.String tel;
	@Column(name = "mobile")
	private java.lang.String mobile;
	@Column(name = "zip")
	private java.lang.String zip;
	@Column(name = "comefrom")
	private java.lang.String comefrom;
	@Column(name = "address")
	private java.lang.String address;
	@Column(name = "gender")
	private java.lang.Boolean gender;
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private java.util.Date birthday;
	@Column(name = "last_login_time")
	private java.util.Date lastLoginTime;
	@Column(name = "last_login_ip")
	private java.lang.String lastLoginIp;
	@Column(name = "current_login_time")
	private java.util.Date currentLoginTime;
	@Column(name = "current_login_ip")
	private java.lang.String currentLoginIp;
	@Column(name = "login_Count")
	private java.lang.Long loginCount;
	@Column(name = "disabled")
	private java.lang.Boolean disabled;

	public User() {
	}

	public User(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public java.lang.String getLoginName() {
		return loginName;
	}

	public void setLoginName(java.lang.String loginName) {
		this.loginName = loginName;
	}

	public java.lang.String getRealName() {
		return realName;
	}

	public void setRealName(java.lang.String realName) {
		this.realName = realName;
	}

	public java.lang.String getPassword() {
		return password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.Integer getUnreadMsg() {
		return unreadMsg;
	}

	public void setUnreadMsg(java.lang.Integer unreadMsg) {
		this.unreadMsg = unreadMsg;
	}

	public java.lang.String getFax() {
		return fax;
	}

	public void setFax(java.lang.String fax) {
		this.fax = fax;
	}

	public java.lang.String getTel() {
		return tel;
	}

	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}

	public java.lang.String getMobile() {
		return mobile;
	}

	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}

	public java.lang.String getZip() {
		return zip;
	}

	public void setZip(java.lang.String zip) {
		this.zip = zip;
	}

	public java.lang.String getComefrom() {
		return comefrom;
	}

	public void setComefrom(java.lang.String comefrom) {
		this.comefrom = comefrom;
	}

	public java.lang.String getAddress() {
		return address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.Boolean getGender() {
		return gender;
	}

	public void setGender(java.lang.Boolean gender) {
		this.gender = gender;
	}

	public java.util.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}

	public java.util.Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(java.util.Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public java.lang.String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(java.lang.String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public java.util.Date getCurrentLoginTime() {
		return currentLoginTime;
	}

	public void setCurrentLoginTime(java.util.Date currentLoginTime) {
		this.currentLoginTime = currentLoginTime;
	}

	public java.lang.String getCurrentLoginIp() {
		return currentLoginIp;
	}

	public void setCurrentLoginIp(java.lang.String currentLoginIp) {
		this.currentLoginIp = currentLoginIp;
	}

	public java.lang.Long getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(java.lang.Long loginCount) {
		this.loginCount = loginCount;
	}

	public java.lang.Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(java.lang.Boolean disabled) {
		this.disabled = disabled;
	}

}