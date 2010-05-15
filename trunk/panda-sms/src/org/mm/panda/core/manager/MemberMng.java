package org.mm.panda.core.manager;

import java.util.List;

import org.mm.panda.common.page.Pagination;
import org.mm.panda.core.CoreManager;
import org.mm.panda.core.entity.Member;
import org.mm.panda.core.entity.User;
import org.mm.panda.core.exception.UserRegisterException;

public interface MemberMng extends CoreManager<Member> {
	public Pagination getAll(int page, int countPerPage);

	public List<Member> getAll();

	/**
	 * 通过登录名获取Member
	 * 
	 * @param loginName
	 *            登录名
	 * @return
	 */
	public Member getByLoginName(String loginName);

	/**
	 * 通过用户ID获取Member
	 * 
	 * @param userId
	 *            用户ID
	 * @return
	 */
	public Member getByUserId(Integer userId);

	/**
	 * 注册用户
	 * 
	 * @param user
	 * @param member
	 * @param isExist
	 * @return
	 * @throws UserRegisterException
	 */
	public Member register(User user, Member member, boolean isExist)
			throws UserRegisterException;

	/**
	 * 注册用户
	 * 
	 * @param user
	 * @param isExist
	 * @throws UserRegisteredException
	 *             用户注册异常
	 */
	public Member register(User user, boolean isExist)
			throws UserRegisterException;

	/**
	 * 获得登录的会员
	 * <p>
	 * 如果管理员登录了，可从通过userId获得会员
	 * </p>
	 * 
	 * @param userId
	 * @return
	 */
	public Member getLoginMember(Integer userId, Integer memberId);
}