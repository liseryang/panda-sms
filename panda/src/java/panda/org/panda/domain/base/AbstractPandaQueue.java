package org.panda.domain.base;

import org.panda.domain.PandaCard;
import org.panda.domain.PandaUserInfo;

/**
 * AbstractPandaQueue entity provides the base persistence definition of the
 * PandaQueue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandaQueue implements java.io.Serializable {

	// Fields

	private Integer id;
	private PandaUserInfo pandaUserInfo;
	private PandaCard pandaCard;
	private Short isReturn;

	// Constructors

	/** default constructor */
	public AbstractPandaQueue() {
	}

	/** full constructor */
	public AbstractPandaQueue(PandaUserInfo pandaUserInfo, PandaCard pandaCard,
			Short isReturn) {
		this.pandaUserInfo = pandaUserInfo;
		this.pandaCard = pandaCard;
		this.isReturn = isReturn;
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

	public PandaCard getPandaCard() {
		return this.pandaCard;
	}

	public void setPandaCard(PandaCard pandaCard) {
		this.pandaCard = pandaCard;
	}

	public Short getIsReturn() {
		return this.isReturn;
	}

	public void setIsReturn(Short isReturn) {
		this.isReturn = isReturn;
	}

}