package com.ztwl.mdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement //启动注解事务管理,相当于xml配置方式<tx:annotation-drivern/>
@MapperScan("com.ztwl.mdata.mapper")
public class MassifDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MassifDataServiceApplication.class, args);
	}

}

