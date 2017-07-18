package com.gb.health.controller;

import com.gb.health.init.MyContextListener;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public abstract class BaseCtl {


	protected HttpServletRequest mRequest;
	protected HttpServletResponse mResponse;
	protected static WebApplicationContext mWAppCtxt = (WebApplicationContext) MyContextListener.getApplicationContext();
	
	@ModelAttribute
	private void init(HttpServletRequest mRequest,HttpServletResponse mResponse){
		this.mRequest = mRequest;
		this.mResponse =mResponse;
	}
	

	protected Object getSessionAttr(String key) {
		return mRequest.getSession().getAttribute(key);
	}

	protected void saveSessionAttr(String key,Object ac) {
		mRequest.getSession().setAttribute(key, ac);
	}
	protected void removeSessionAttr(String key) {
		mRequest.getSession().removeAttribute(key);
	}
	
	
	protected void write(Object ob) throws IOException {
		mResponse.setContentType("text/html;charset=UTF-8");
		mResponse.getWriter().print(ob);
		mResponse.getWriter().flush();
		mResponse.getWriter().close();
	}

	
}
