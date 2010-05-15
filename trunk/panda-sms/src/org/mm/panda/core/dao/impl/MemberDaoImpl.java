package org.mm.panda.core.dao.impl;

import org.mm.panda.core.CoreDaoImpl;
import org.mm.panda.core.entity.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberDaoImpl extends CoreDaoImpl<Member> implements
		org.mm.panda.core.dao.MemberDao {

	@Override
	public Member getByUserId(Integer userId) {
		String hql = "from Member bean where bean.user.id=?";
		return (Member) findUnique(hql, userId);
	}
}
