package org.mm.panda.core.manager.impl;

import java.util.List;

import org.mm.panda.common.page.Pagination;
import org.mm.panda.common.struts2.ContextPvd;
import org.mm.panda.core.CoreManagerImpl;
import org.mm.panda.core.dao.MemberDao;
import org.mm.panda.core.entity.Member;
import org.mm.panda.core.entity.User;
import org.mm.panda.core.exception.UserRegisterException;
import org.mm.panda.core.manager.MemberMng;
import org.mm.panda.core.manager.UserMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class MemberMngImpl extends CoreManagerImpl<Member> implements MemberMng {

	@Autowired
	private UserMng userMng;
	@Autowired
	private ContextPvd contextPvd;

	@Autowired
	public void setMemerDao(MemberDao memberDao) {
		super.setDao(memberDao);
	}

	public MemberDao getMemberDao() {
		return (MemberDao) super.getDao();
	}

	@Override
	public Pagination getAll(int page, int countPerPage) {
		return this.getMemberDao().findAll(page, countPerPage, null);
	}

	@Override
	public List<Member> getAll() {
		return this.getMemberDao().findAll();
	}

	@Override
	public Member getByLoginName(String loginName) {
		User user = this.userMng.getByLoginName(loginName);
		return this.getMemberDao().getByUserId(user.getId());
	}

	@Override
	public Member getByUserId(Integer userId) {

		return this.getByUserId(userId);
	}

	@Override
	public Member getLoginMember(Integer userId, Integer memberId) {
		// 用户未登录
		if (userId == null) {
			return null;
		}
		// 会员已登录
		if (memberId != null) {
			Member member = findById(memberId);
			return member;
		}
		// 用户登录，会员未登录
		Member m = getByUserId(userId);
		if (m != null) {
			// 保存登录信息
			contextPvd.setSessionAttr(Member.MEMBER_KEY, m.getId());
		}
		return m;
	}

	@Override
	public Member register(User user, Member member, boolean isExist)
			throws UserRegisterException {
		Assert.notNull(user);
		Assert.notNull(member);
		user = userMng.register(user, isExist);
		// 原会员
		Member omember = getByUserId(user.getId());
		if (omember != null) {
			return omember;
		} else {
			member.setUser(user);
			return save(member);
		}
	}

	@Override
	public Member register(User user, boolean isExist)
			throws UserRegisterException {
		Assert.notNull(user);
		Member member = new Member();
		return register(user, member, isExist);
	}

}
