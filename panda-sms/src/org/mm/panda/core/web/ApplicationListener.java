package org.mm.panda.core.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public final class ApplicationListener implements ServletContextListener {
	private static final Logger log = LoggerFactory
			.getLogger(ApplicationListener.class);

	public void contextDestroyed(ServletContextEvent event) {
		log.info("关闭中……");
		System.out.println("关闭中……");
	}

	@SuppressWarnings("unused")
	public void contextInitialized(ServletContextEvent event) {

		WebApplicationContext wac = WebApplicationContextUtils
				.getRequiredWebApplicationContext(event.getServletContext());
		/*
		 * AnnotationSessionFactoryBean ab = wac.getBean("sessionFactory",
		 * AnnotationSessionFactoryBean.class); ab.getConfiguration();
		 * ab.updateDatabaseSchema();
		 */
		log.info("启动中……");
	}

}
