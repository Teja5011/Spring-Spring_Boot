package com.jspiders.boot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) {
//		SpringApplication.run(Boot1Application.class, args);
		System.out.println(" HII WELCOME TO SPRING BOOT ");
		ApplicationContext context=SpringApplication.run(Boot1Application.class);
		System.out.println(context.getBean(Demo1.class));
		
	}

}
