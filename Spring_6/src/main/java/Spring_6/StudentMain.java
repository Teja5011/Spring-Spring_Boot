package Spring_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring_6.controller.StudentController;
import Spring_6.dao.StudentDao;
import Spring_6.dto.Student;
import Spring_6.service.StudentService;
import Spring_6.util.StudentUtil;



public class StudentMain
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		System.out.println(context.getBean(StudentConfig.class));
		System.out.println(context.getBean(Student.class));
		System.out.println(context.getBean(StudentDao.class));
		System.out.println(context.getBean(StudentService.class));
		System.out.println(context.getBean(StudentController.class));
		System.out.println(context.getBean(StudentUtil.class));
		
		
	}
}
