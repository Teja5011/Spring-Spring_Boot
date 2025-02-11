package Spring_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerMain 
{
 public static void main(String[] args) 
	{
	 	
		ApplicationContext context= new ClassPathXmlApplicationContext("container.xml");
		System.out.println(context.getBean(Demo1.class));
		System.out.println(context.getBean(Demo1.class));
		System.out.println(context.getBean("d"));
	
	}
}