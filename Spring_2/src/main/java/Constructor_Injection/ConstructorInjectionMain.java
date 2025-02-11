package Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");
		System.out.println(context.getBean(Projector.class));
	}
}
