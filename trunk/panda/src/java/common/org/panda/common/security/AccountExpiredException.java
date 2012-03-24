package org.panda.common.security;

/**
 * 账号过期异常
 * 
 * @author liuyf
 * 
 */
@SuppressWarnings("serial")
public class AccountExpiredException extends AccountStatusException {
	public AccountExpiredException() {
	}
	public AccountExpiredException(String msg) {
		super(msg);
	}
	public AccountExpiredException(String msg, Object extraInformation) {
		super(msg, extraInformation);
	}
}
