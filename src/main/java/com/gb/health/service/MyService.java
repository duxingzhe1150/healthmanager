package com.gb.health.service;

import com.gb.health.op.Company;
import com.gb.health.op.HttpResult;
import com.gb.health.utils.ResultUtil;
import org.springframework.stereotype.Service;

/**
 * 测试服务类
 * Created by Administrator on 2017/7/19 0019.
 */
@Service
public class MyService {

    public HttpResult addCompany(Company company){

        if (company.getId()==0 || company.getCompanyName()==null){
            throw new RuntimeException("数据不全");
        }else if (company.getId()<=0){
            throw new RuntimeException("编号非法");
        }else if(company.getId()>50) {
            throw new RuntimeException("编号太大了");
        }

        return ResultUtil.success(company);

    }
}
