package org.panda.domain.base;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaEnterprise entity provides the base persistence definition of
 * the PandaEnterprise entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaEnterprise implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;
	private String enterpriseName;
	private String enterpriseAddress;
	private Integer provinceId;
	private Integer cityId;
	private String telephone;
	private String enterpriseFax;
	private String enterpriseUrl;
	private Timestamp upTime;
	private Boolean isChecked;
	private String introduction;
	private Set pandaCards = new HashSet(0);
	private Set pandanSubscribeEmails = new HashSet(0);
	private Set pandanSubscribeSmses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPandaEnterprise() {
	}

	/** minimal constructor */
	public AbstractPandaEnterprise(PandaUserInfo pandaUserInfo) {
		this.pandaUserInfo = pandaUserInfo;
	}

	/** full constructor */
	public AbstractPandaEnterprise(PandaUserInfo pandaUserInfo,
			String enterpriseName, String enterpriseAddress,
			Integer provinceId, Integer cityId, String telephone,
			String enterpriseFax, String enterpriseUrl, Timestamp upTime,
			Boolean isChecked, String introduction, Set pandaCards,
			Set pandanSubscribeEmails, Set pandanSubscribeSmses) {
		this.pandaUserInfo = pandaUserInfo;
		this.enterpriseName = enterpriseName;
		this.enterpriseAddress = enterpriseAddress;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.telephone = telephone;
		this.enterpriseFax = enterpriseFax;
		this.enterpriseUrl = enterpriseUrl;
		this.upTime = upTime;
		this.isChecked = isChecked;
		this.introduction = introduction;
		this.pandaCards = pandaCards;
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

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseAddress() {
		return this.enterpriseAddress;
	}

	public void setEnterpriseAddress(String enterpriseAddress) {
		this.enterpriseAddress = enterpriseAddress;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEnterpriseFax() {
		return this.enterpriseFax;
	}

	public void setEnterpriseFax(String enterpriseFax) {
		this.enterpriseFax = enterpriseFax;
	}

	public String getEnterpriseUrl() {
		return this.enterpriseUrl;
	}

	public void setEnterpriseUrl(String enterpriseUrl) {
		this.enterpriseUrl = enterpriseUrl;
	}

	public Timestamp getUpTime() {
		return this.upTime;
	}

	public void setUpTime(Timestamp upTime) {
		this.upTime = upTime;
	}

	public Boolean getIsChecked() {
		return this.isChecked;
	}

	public void setIsChecked(Boolean isChecked) {
		this.isChecked = isChecked;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Set getPandaCards() {
		return this.pandaCards;
	}

	public void setPandaCards(Set pandaCards) {
		this.pandaCards = pandaCards;
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