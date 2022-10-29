package com.course;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient //客户端
@ComponentScan("com")
@MapperScan("com.course.server.mapper")
public class SystemlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemlApplication.class, args);
		System.out.println("systme启动成功");
	}
}

