package org.mm.panda.core.dao;

import org.mm.panda.core.CoreDao;
import org.mm.panda.core.entity.Member;

public interface MemberDao extends CoreDao<Member> {
	/**
	 * 获得会员
	 * 
	 * @param userId
	 *            用户ID
	 * @return
	 */
	public Member getByUserId(Integer userId);
}
