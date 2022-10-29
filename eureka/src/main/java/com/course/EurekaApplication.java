package com.course;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //声明为注册中心
public class EurekaApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		System.out.println("eureka启动成功");
	}
}

