package org.panda.domain.base;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.panda.domain.PandaEnterprise;
import org.panda.domain.PandaQueue;

/**
 * AbstractPandaCard entity provides the base persistence definition of the
 * PandaCard entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaCard implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaEnterprise pandaEnterprise;
	private String cardCode;
	private String cardPassword;
	private Integer cardType;
	private Timestamp createTime;
	private Set<PandaQueue> pandaQueues = new HashSet<PandaQueue>(0);

	// Constructors

	/** default constructor */
	public AbstractPandaCard() {
	}

	/** minimal constructor */
	public AbstractPandaCard(String cardCode, String cardPassword) {
		this.cardCode = cardCode;
		this.cardPassword = cardPassword;
	}

	/** full constructor */
	public AbstractPandaCard(PandaEnterprise pandaEnterprise, String cardCode,
			String cardPassword, Integer cardType, Timestamp createTime,
			Set<PandaQueue> pandaQueues) {
		this.pandaEnterprise = pandaEnterprise;
		this.cardCode = cardCode;
		this.cardPassword = cardPassword;
		this.cardType = cardType;
		this.createTime = createTime;
		this.pandaQueues = pandaQueues;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaEnterprise getPandaEnterprise() {
		return this.pandaEnterprise;
	}

	public void setPandaEnterprise(PandaEnterprise pandaEnterprise) {
		this.pandaEnterprise = pandaEnterprise;
	}

	public String getCardCode() {
		return this.cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getCardPassword() {
		return this.cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public Integer getCardType() {
		return this.cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Set<PandaQueue> getPandaQueues() {
		return this.pandaQueues;
	}

	public void setPandaQueues(Set<PandaQueue> pandaQueues) {
		this.pandaQueues = pandaQueues;
	}

}