package Spring_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain 
{
	public static void main(String[] args)
	{
//		Student s=new Student();
//		System.out.println(s);
//		Student s1=new Student();
//		System.out.println(s1);
//		Student s2=new Student();
//		System.out.println(s2);
//		Student s3=new Student();
//		System.out.println(s3);
		
		Resource resource=new ClassPathResource("container.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		System.out.println(bf);
		System.out.println(bf.getBean(Student.class));
		System.out.println(bf.getBean(Student.class));
		System.out.println(bf.getBean(Student.class));
		System.out.println(bf.getBean(Student.class));
		
	}

}
