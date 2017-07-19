package com.gb.health;

import com.gb.health.init.MyContextListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.gb.health.dao")  //扫描mybatis接口
//@EnableScheduling  //启用定时任务
public class Demo2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =SpringApplication.run(Demo2Application.class, args);

		MyContextListener.setApplicationContext(applicationContext);
	}
}
