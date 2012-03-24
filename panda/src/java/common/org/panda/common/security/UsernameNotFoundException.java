package org.panda.common.security;

/**
 * 用户名没有找到异常
 * 
 * @author liuyf
 * 
 */
@SuppressWarnings("serial")
public class UsernameNotFoundException extends AuthenticationException {
	public UsernameNotFoundException() {
	}

	public UsernameNotFoundException(String msg) {
		super(msg);
	}
}