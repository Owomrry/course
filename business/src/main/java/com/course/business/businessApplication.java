package com.course.business;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient //客户端
@ComponentScan("com")
@MapperScan("com.course.server.mapper")
public class businessApplication {

	public static void main(String[] args) {
		SpringApplication.run(businessApplication.class, args);
		System.out.println("business启动成功");
	}
}

