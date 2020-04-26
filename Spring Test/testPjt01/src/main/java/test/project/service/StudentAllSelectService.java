package test.project.service;

import java.util.Map;

import test.project.dao.StudentDAO;
import test.project.member.Student;

public class StudentAllSelectService {
	private StudentDAO studentDAO;
	
	public StudentAllSelectService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String, Student> allSelect() {
		return studentDAO.getStudentDB();
	}
}