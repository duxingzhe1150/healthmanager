package com.gb.health.handle;

import com.gb.health.op.HttpResult;
import com.gb.health.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 *
 * Created by Administrator on 2017/7/18 0018.
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public HttpResult globalExceptionHandeler(RuntimeException e, HttpServletResponse response){

        return ResultUtil.error(601,e.getMessage());

    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public HttpResult otherExceptionHandler(){
        return ResultUtil.error(605,"未知错误");
    }


}
