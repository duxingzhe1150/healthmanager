package com.gb.health.init;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



public class MyContextListener implements ServletContextListener {
	
	private static WebApplicationContext springContext;

	public static ApplicationContext applicationContext;//启动类set入，调用下面set方法

	public static void setApplicationContext(ApplicationContext context) {
		applicationContext = context;
	}
	

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		springContext = WebApplicationContextUtils
				.getWebApplicationContext(arg0.getServletContext());
		
		
		
    System.out.println("_____________________________");
	}
	public static ApplicationContext getApplicationContext() {
	
		return springContext;
	}
}
