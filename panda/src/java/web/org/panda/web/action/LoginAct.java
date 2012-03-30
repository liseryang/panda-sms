package org.panda.web.action;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginAct {
	private static final Logger log = LoggerFactory.getLogger(LoginAct.class);

	/**
	 * 跳转到后台系统登录页面
	 * @param request
	 * @param model
	 * @return 
	* @create  2012-3-28 下午1:12:29 Administrator
	* @history
	 */
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request, ModelMap model) {
		log.debug("跳转到后台系统登录页面");
		return "/sys/login";
	}
	/**
	 * 处理后台登录信息
	 * @param username
	 * @param password
	 * @param captcha
	 * @return 
	* @create  2012-3-28 下午1:12:54 Administrator
	* @history
	 */
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String submit(String username, String password, String captcha){
		log.debug("登录认证中……");
		return "index";
	}

	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request, ModelMap model) {
		return "test1";
	}
}
