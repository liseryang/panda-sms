package org.panda.domain.base;

import org.panda.domain.PandaEnterprise;
import org.panda.domain.PandaSubscriber;

/**
 * AbstractPandanSubscribeEmail entity provides the base persistence definition
 * of the PandanSubscribeEmail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPandanSubscribeEmail implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private PandaSubscriber pandaSubscriber;
	private PandaEnterprise pandaEnterprise;

	// Constructors

	/** default constructor */
	public AbstractPandanSubscribeEmail() {
	}

	/** full constructor */
	public AbstractPandanSubscribeEmail(PandaSubscriber pandaSubscriber,
			PandaEnterprise pandaEnterprise) {
		this.pandaSubscriber = pandaSubscriber;
		this.pandaEnterprise = pandaEnterprise;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PandaSubscriber getPandaSubscriber() {
		return this.pandaSubscriber;
	}

	public void setPandaSubscriber(PandaSubscriber pandaSubscriber) {
		this.pandaSubscriber = pandaSubscriber;
	}

	public PandaEnterprise getPandaEnterprise() {
		return this.pandaEnterprise;
	}

	public void setPandaEnterprise(PandaEnterprise pandaEnterprise) {
		this.pandaEnterprise = pandaEnterprise;
	}

}