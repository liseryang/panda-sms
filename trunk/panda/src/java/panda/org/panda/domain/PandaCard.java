package org.panda.domain;

import java.sql.Timestamp;
import java.util.Set;

import org.panda.domain.base.AbstractPandaCard;

/**
 * PandaCard entity. @author MyEclipse Persistence Tools
 */
public class PandaCard extends AbstractPandaCard {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Constructors

	/** default constructor */
	public PandaCard() {
	}

	/** minimal constructor */
	public PandaCard(String cardCode, String cardPassword) {
		super(cardCode, cardPassword);
	}

	/** full constructor */
	public PandaCard(PandaEnterprise pandaEnterprise, String cardCode,
			String cardPassword, Integer cardType, Timestamp createTime,
			Set pandaQueues) {
		super(pandaEnterprise, cardCode, cardPassword, cardType, createTime,
				pandaQueues);
	}

}
