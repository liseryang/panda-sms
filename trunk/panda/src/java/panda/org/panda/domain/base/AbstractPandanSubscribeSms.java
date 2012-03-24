package org.panda.domain.base;

import org.panda.domain.PandaEnterprise;
import org.panda.domain.PandaSubscriber;

/**
 * AbstractPandanSubscribeSms entity provides the base persistence definition of
 * the PandanSubscribeSms entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandanSubscribeSms implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private PandaEnterprise pandaEnterprise;
	private PandaSubscriber pandaSubscriber;

	// Constructors

	/** default constructor */
	public AbstractPandanSubscribeSms() {
	}

	/** full constructor */
	public AbstractPandanSubscribeSms(PandaEnterprise pandaEnterprise,
			PandaSubscriber pandaSubscriber) {
		this.pandaEnterprise = pandaEnterprise;
		this.pandaSubscriber = pandaSubscriber;
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

	public PandaSubscriber getPandaSubscriber() {
		return this.pandaSubscriber;
	}

	public void setPandaSubscriber(PandaSubscriber pandaSubscriber) {
		this.pandaSubscriber = pandaSubscriber;
	}

}