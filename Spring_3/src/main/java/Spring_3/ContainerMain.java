package Spring_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerMain 
{
	public static void main(String[] args)
	{

		ApplicationContext context=new AnnotationConfigApplicationContext(ContainerConfiguration.class);
	    System.out.println(context.getBean(Demo.class));
	    System.out.println(context.getBean(Demo.class));
	    System.out.println(context.getBean(Demo.class));
	    System.out.println(context.getBean(Demo.class));
	}
}
