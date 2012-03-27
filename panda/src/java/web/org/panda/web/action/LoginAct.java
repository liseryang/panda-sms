package org.panda.web.action;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login.do")
public class LoginAct {
	private static final Logger log = LoggerFactory.getLogger(LoginAct.class);

	@RequestMapping("/login")
	public String login(HttpServletRequest request, ModelMap model) {
		log.debug("进入login");
		Enumeration<String> enumer = request.getParameterNames();
		while (enumer.hasMoreElements()) {
			String name = enumer.nextElement();
			String value = request.getParameter(name);
			model.put(name, value);
		}
		return "/sys/login";
	}

	@RequestMapping(params = "method=logout")
	public String logout(HttpServletRequest request, ModelMap model) {
		return "test1";
	}
}
