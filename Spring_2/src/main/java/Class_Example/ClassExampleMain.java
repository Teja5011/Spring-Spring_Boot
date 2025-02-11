package Class_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassExampleMain
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("example.xml");
		System.out.println(context.getBean(Student.class));
		System.out.println(context.getBean(PanCard.class));
	}

}
