package service.impl;

import enums.Gender;
import model.Student;
import service.StudentService;

import javax.xml.ws.ServiceMode;

/**
 * @author wangchaohui
 * @version 1.0
 * @date 2018/11/27 23:17
 */
public class StudentServiceImpl implements StudentService {

	public Student getStudentById(int id) {
		return new Student(1,"wch",28,Gender.MALE);
	}
}
