package com.gb.health;

import com.gb.health.config.DebugConfig;
import com.gb.health.init.MyContextListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.gb.health.dao")  //扫描mybatis接口
@EnableTransactionManagement      //开启事务管理
@EnableConfigurationProperties(DebugConfig.class)
//@EnableScheduling  //启用定时任务
public class HealthManagerApplication {



	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =SpringApplication.run(HealthManagerApplication.class, args);

		MyContextListener.setApplicationContext(applicationContext);

	}

}
