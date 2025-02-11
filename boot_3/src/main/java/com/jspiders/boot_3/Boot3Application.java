package com.jspiders.boot_3;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.jspiders.boot_3.controller.DemoController;
import com.jspiders.boot_3.dao.DemoDao;

@SpringBootApplication
public class Boot3Application {

	public static void main(String[] args) 
	{
	
		ApplicationContext c=SpringApplication.run(Boot3Application.class,args);
		System.out.println(c.getBean(CinemaHall.class));
		System.out.println(c.getBean(List.class));
		
		CinemaHall hall=c.getBean(CinemaHall.class);
		hall.movie.showTime();
		
		
		
		System.out.println(c.getBean(DemoDao.class));
		System.out.println(c.getBean(List.class));
		
		DemoController controller=c.getBean(DemoController.class);
		controller.dao.save();
		
		
	}
	
	@Bean   //method level annontaion used to create predefined   
	public List m1()
	{
		return new ArrayList();
	}
	
	@Bean   //method level annontaion used to create predefined   
	public List m2()
	{
		return new ArrayList();
	}
	
}
