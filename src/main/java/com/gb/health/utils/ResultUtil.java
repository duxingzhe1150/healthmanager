package com.gb.health.utils;

import com.gb.health.op.HttpResult;

/**
 * 设置返回信息的工具类
 * Created by Administrator on 2017/7/18 0018.
 */
public class ResultUtil {

    public static HttpResult success(Object object){
        HttpResult result=new HttpResult();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);

        return result;
    }

    public static HttpResult error(Integer code,String msg){
        HttpResult result=new HttpResult();
        result.setCode(code);
        result.setMsg(msg);

        return result;

    }

}
