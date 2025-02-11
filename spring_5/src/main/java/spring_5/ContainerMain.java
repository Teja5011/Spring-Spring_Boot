package spring_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_5.dao.Demo7;
import spring_5.dto.Demo3;
import spring_5.dto.Demo4;
import spring_5_dto.Demo5;
import spring_5_dto.Demo6;

public class ContainerMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(ContainerConfiguration.class);
		System.out.println(context.getBean(Demo1.class));
		System.out.println(context.getBean(Demo2.class));
		System.out.println(context.getBean(Demo3.class));
		System.out.println(context.getBean(Demo4.class));
		System.out.println(context.getBean(Demo5.class));
		System.out.println(context.getBean(Demo6.class));
		System.out.println(context.getBean(Demo7.class));
	}
}
