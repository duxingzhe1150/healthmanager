package com.gb.health.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 控制层的切面拦截
 * Created by Administrator on 2017/7/14 0014.
 */
@Aspect
@Component
public class WebControllerAOP {

    private static Logger logger=Logger.getLogger(WebControllerAOP.class);


    //匹配com.example.demo.controller包及其子包下的所有类的所有方法
    @Pointcut("execution(* com.example.demo.controller..*.*(..))")
    public void executeService(){

    }

    @Before("executeService()")
    public void controllerLog(JoinPoint joinPoint){

        System.out.println(1111111111);
        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        Object[] obj = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();

        logger.info("ip："+request.getRemoteAddr());
        logger.info("url："+request.getRequestURL());
        logger.info("类名："+signature.getDeclaringTypeName());
        logger.info("方法名："+signature.getName());

        Enumeration<String> enumeration = request.getParameterNames();
        Map<String,String> parameterMap = new HashMap<>();
        while (enumeration.hasMoreElements()){
            String parameter = enumeration.nextElement();
            parameterMap.put(parameter,request.getParameter(parameter));
        }
        String str = parameterMap.toString();
        if(obj.length > 0) {
            logger.info("请求的参数信息为："+str);
        }


    }


    @After("executeService()")
    public void returnLog(JoinPoint joinPoint){

        System.out.println(22222222);
        //logger.info("");

    }

}
