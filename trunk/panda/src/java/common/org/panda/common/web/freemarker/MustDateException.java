package org.panda.common.web.freemarker;

import freemarker.template.TemplateModelException;

/**
 * 非时间参数异常
 * 
 * @author liuyf
 * 
 */
@SuppressWarnings("serial")
public class MustDateException extends TemplateModelException {
	public MustDateException(String paramName) {
		super("The \"" + paramName + "\" parameter must be a date.");
	}
}
