package org.mm.panda.core.exception;

/**
 * 用户注册异常。
 * 
 * 
 */
@SuppressWarnings("serial")
public class UserRegisterException extends RuntimeException {
	public UserRegisterException() {
		super();
	}

	public UserRegisterException(String msg) {
		super(msg);
	}
}
