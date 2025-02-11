package com.jspiders.boot_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jspiders.boot_2.dao.Demo2;

@SpringBootApplication
public class Boot2Application {
	

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext c=SpringApplication.run(Boot2Application.class, args);
		System.out.println(c.getBean(Demo.class));
		System.out.println(c.getBean(Demo2.class));
		
		
	}

}
