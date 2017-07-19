package com.gb.health.controller;

import com.gb.health.op.Company;
import com.gb.health.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试返回内容
 * Created by Administrator on 2017/7/18 0018.
 */
@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping(value = "/addCompany")
    public void companyAdd(Company company){
       myService.addCompany(company);
    }

}
