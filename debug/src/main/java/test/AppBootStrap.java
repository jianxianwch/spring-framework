package test;

import model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;

/**
 * @author wangchaohui
 * @version 1.0
 * @date 2018/11/27 23:23
 */
public class AppBootStrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		StudentService service = context.getBean(StudentService.class);
		Student student = service.getStudentById(1);
		System.out.println(student);
	}
}
