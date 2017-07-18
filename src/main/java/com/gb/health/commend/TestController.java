/**
 * FileName:     TestController.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年1月5日 上午11:45:32
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年1月5日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.commend;

import com.gb.health.controller.BaseCtl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:     TestController.java
 * @Description:   TODO
 * 测试
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年1月5日 上午11:45:32 

 */
@Controller
public class TestController extends  BaseCtl{
	
	
	
	@RequestMapping(value = "/test")
	public String index(){
		return "indext";
	}

}
