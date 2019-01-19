package com.linbsoft.microservicehystrixdashboard8502;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class MicroserviceHystrixDashboard8502Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHystrixDashboard8502Application.class, args);
	}

}

