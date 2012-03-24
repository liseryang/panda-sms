package org.panda.domain;

import java.sql.Timestamp;
import java.util.Set;

import org.panda.domain.base.AbstractPandaEnterprise;

/**
 * PandaEnterprise entity. @author MyEclipse Persistence Tools
 */
public class PandaEnterprise extends AbstractPandaEnterprise implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PandaEnterprise() {
	}

	/** minimal constructor */
	public PandaEnterprise(PandaUserInfo pandaUserInfo) {
		super(pandaUserInfo);
	}

	/** full constructor */
	public PandaEnterprise(PandaUserInfo pandaUserInfo, String enterpriseName,
			String enterpriseAddress, Integer provinceId, Integer cityId,
			String telephone, String enterpriseFax, String enterpriseUrl,
			Timestamp upTime, Boolean isChecked, String introduction,
			Set pandaCards, Set pandanSubscribeEmails, Set pandanSubscribeSmses) {
		super(pandaUserInfo, enterpriseName, enterpriseAddress, provinceId,
				cityId, telephone, enterpriseFax, enterpriseUrl, upTime,
				isChecked, introduction, pandaCards, pandanSubscribeEmails,
				pandanSubscribeSmses);
	}

}
