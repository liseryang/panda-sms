package org.mm.panda.core.entity.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "opreatorId")
	private Integer opreatorId;

	@Column(name = "createDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "updateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Integer getOpreatorId() {
		return opreatorId;
	}

	public void setOpreatorId(Integer opreatorId) {
		this.opreatorId = opreatorId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
