package org.panda.domain.base;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.panda.domain.PandaEnterprise;
import org.panda.domain.PandaGroup;
import org.panda.domain.PandaMember;
import org.panda.domain.PandaSubscriber;

/**
 * AbstractPandaUserInfo entity provides the base persistence definition of the
 * PandaUserInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaUserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaGroup pandaGroup;
	private Short userType;
	private String nickName;
	private String userName;
	private String password;
	private String headPhoto;
	private String userEmail;
	private Timestamp registerTime;
	private String registerIp;
	private Timestamp lastLoginTime;
	private String lastLoginIp;
	private Long loginCount;
	private Boolean isDisabled;
	private Boolean activation;
	private String activationCode;
	private String resetKey;
	private String resetPwd;
	private Timestamp errorTime;
	private Integer errorCount;
	private String errorIp;
	private String telephone;
	private PandaSubscriber pandaSubscriber;
	private Set pandaReceiverMessagesForMsgSendUser = new HashSet(0);
	private Set pandaQueues = new HashSet(0);
	private Set pandaUserRoles = new HashSet(0);
	private Set pandaSendMessagesForMsgSendUser = new HashSet(0);
	private PandaMember pandaMember;
	private Set pandaReceiverMessagesForMsgReceiverUser = new HashSet(0);
	private PandaEnterprise pandaEnterprise;
	private Set pandaEmails = new HashSet(0);
	private Set pandaSmses = new HashSet(0);
	private Set pandaSendMessagesForMsgReceiverUser = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPandaUserInfo() {
	}

	/** full constructor */
	public AbstractPandaUserInfo(PandaGroup pandaGroup, Short userType,
			String nickName, String userName, String password,
			String headPhoto, String userEmail, Timestamp registerTime,
			String registerIp, Timestamp lastLoginTime, String lastLoginIp,
			Long loginCount, Boolean isDisabled, Boolean activation,
			String activationCode, String resetKey, String resetPwd,
			Timestamp errorTime, Integer errorCount, String errorIp,
			String telephone, PandaSubscriber pandaSubscriber,
			Set pandaReceiverMessagesForMsgSendUser, Set pandaQueues,
			Set pandaUserRoles, Set pandaSendMessagesForMsgSendUser,
			PandaMember pandaMember,
			Set pandaReceiverMessagesForMsgReceiverUser,
			PandaEnterprise pandaEnterprise, Set pandaEmails, Set pandaSmses,
			Set pandaSendMessagesForMsgReceiverUser) {
		this.pandaGroup = pandaGroup;
		this.userType = userType;
		this.nickName = nickName;
		this.userName = userName;
		this.password = password;
		this.headPhoto = headPhoto;
		this.userEmail = userEmail;
		this.registerTime = registerTime;
		this.registerIp = registerIp;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.loginCount = loginCount;
		this.isDisabled = isDisabled;
		this.activation = activation;
		this.activationCode = activationCode;
		this.resetKey = resetKey;
		this.resetPwd = resetPwd;
		this.errorTime = errorTime;
		this.errorCount = errorCount;
		this.errorIp = errorIp;
		this.telephone = telephone;
		this.pandaSubscriber = pandaSubscriber;
		this.pandaReceiverMessagesForMsgSendUser = pandaReceiverMessagesForMsgSendUser;
		this.pandaQueues = pandaQueues;
		this.pandaUserRoles = pandaUserRoles;
		this.pandaSendMessagesForMsgSendUser = pandaSendMessagesForMsgSendUser;
		this.pandaMember = pandaMember;
		this.pandaReceiverMessagesForMsgReceiverUser = pandaReceiverMessagesForMsgReceiverUser;
		this.pandaEnterprise = pandaEnterprise;
		this.pandaEmails = pandaEmails;
		this.pandaSmses = pandaSmses;
		this.pandaSendMessagesForMsgReceiverUser = pandaSendMessagesForMsgReceiverUser;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaGroup getPandaGroup() {
		return this.pandaGroup;
	}

	public void setPandaGroup(PandaGroup pandaGroup) {
		this.pandaGroup = pandaGroup;
	}

	public Short getUserType() {
		return this.userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	public String getHeadPhoto() {
		return this.headPhoto;
	}

	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Timestamp getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Long getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(Long loginCount) {
		this.loginCount = loginCount;
	}

	public Boolean getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Boolean getActivation() {
		return this.activation;
	}

	public void setActivation(Boolean activation) {
		this.activation = activation;
	}

	public String getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getResetKey() {
		return this.resetKey;
	}

	public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}

	public String getResetPwd() {
		return this.resetPwd;
	}

	public void setResetPwd(String resetPwd) {
		this.resetPwd = resetPwd;
	}

	public Timestamp getErrorTime() {
		return this.errorTime;
	}

	public void setErrorTime(Timestamp errorTime) {
		this.errorTime = errorTime;
	}

	public Integer getErrorCount() {
		return this.errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public String getErrorIp() {
		return this.errorIp;
	}

	public void setErrorIp(String errorIp) {
		this.errorIp = errorIp;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public PandaSubscriber getPandaSubscriber() {
		return this.pandaSubscriber;
	}

	public void setPandaSubscriber(PandaSubscriber pandaSubscriber) {
		this.pandaSubscriber = pandaSubscriber;
	}

	public Set getPandaReceiverMessagesForMsgSendUser() {
		return this.pandaReceiverMessagesForMsgSendUser;
	}

	public void setPandaReceiverMessagesForMsgSendUser(
			Set pandaReceiverMessagesForMsgSendUser) {
		this.pandaReceiverMessagesForMsgSendUser = pandaReceiverMessagesForMsgSendUser;
	}

	public Set getPandaQueues() {
		return this.pandaQueues;
	}

	public void setPandaQueues(Set pandaQueues) {
		this.pandaQueues = pandaQueues;
	}

	public Set getPandaUserRoles() {
		return this.pandaUserRoles;
	}

	public void setPandaUserRoles(Set pandaUserRoles) {
		this.pandaUserRoles = pandaUserRoles;
	}

	public Set getPandaSendMessagesForMsgSendUser() {
		return this.pandaSendMessagesForMsgSendUser;
	}

	public void setPandaSendMessagesForMsgSendUser(
			Set pandaSendMessagesForMsgSendUser) {
		this.pandaSendMessagesForMsgSendUser = pandaSendMessagesForMsgSendUser;
	}

	public PandaMember getPandaMember() {
		return this.pandaMember;
	}

	public void setPandaMember(PandaMember pandaMember) {
		this.pandaMember = pandaMember;
	}

	public Set getPandaReceiverMessagesForMsgReceiverUser() {
		return this.pandaReceiverMessagesForMsgReceiverUser;
	}

	public void setPandaReceiverMessagesForMsgReceiverUser(
			Set pandaReceiverMessagesForMsgReceiverUser) {
		this.pandaReceiverMessagesForMsgReceiverUser = pandaReceiverMessagesForMsgReceiverUser;
	}

	public PandaEnterprise getPandaEnterprise() {
		return this.pandaEnterprise;
	}

	public void setPandaEnterprise(PandaEnterprise pandaEnterprise) {
		this.pandaEnterprise = pandaEnterprise;
	}

	public Set getPandaEmails() {
		return this.pandaEmails;
	}

	public void setPandaEmails(Set pandaEmails) {
		this.pandaEmails = pandaEmails;
	}

	public Set getPandaSmses() {
		return this.pandaSmses;
	}

	public void setPandaSmses(Set pandaSmses) {
		this.pandaSmses = pandaSmses;
	}

	public Set getPandaSendMessagesForMsgReceiverUser() {
		return this.pandaSendMessagesForMsgReceiverUser;
	}

	public void setPandaSendMessagesForMsgReceiverUser(
			Set pandaSendMessagesForMsgReceiverUser) {
		this.pandaSendMessagesForMsgReceiverUser = pandaSendMessagesForMsgReceiverUser;
	}

}