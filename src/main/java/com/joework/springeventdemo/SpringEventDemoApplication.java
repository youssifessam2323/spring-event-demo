package com.joework.springeventdemo;

import com.joework.springeventdemo.config.AppConfig;
import com.joework.springeventdemo.publishers.EmployeeEventPublisher;
import com.joework.springeventdemo.services.EmployeeManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringEventDemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringEventDemoApplication.class, args);
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeManager publisher = context.getBean(EmployeeEventPublisher.class);

		publisher.createNewEmployee();
		publisher.createNewEmployee();

	}

}
