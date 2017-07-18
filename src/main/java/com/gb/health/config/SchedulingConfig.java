package com.gb.health.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务配置类
 * Created by Administrator on 2017/7/13 0013.
 */
@Configuration
public class SchedulingConfig {

    @Scheduled(cron = "0/20 * * * * ?")
    public void sayHello(){

        System.out.println("hello,hello!");

    }

}
