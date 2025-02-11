package Field_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Setter_Injection.Student;

public class FieldInjectionMain
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("field.xml");
		System.out.println(context.getBean(Bottle.class));
		System.out.println(context.getBean(Liquid.class));
	}
}
