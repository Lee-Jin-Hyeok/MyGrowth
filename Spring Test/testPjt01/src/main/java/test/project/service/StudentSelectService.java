package test.project.service;

import test.project.dao.StudentDAO;
import test.project.member.Student;

public class StudentSelectService {
	private StudentDAO studentDAO;
	
	public StudentSelectService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Student select(String serialNumber) {
		if(verify(serialNumber)) {
			Student student = studentDAO.select(serialNumber);
			return student;
		} else {
			System.out.println("�л� ������ �������� �ʽ��ϴ�.");
			return null;
		}
	}
	
	public boolean verify(String serialNumber) {
		Student s = studentDAO.select(serialNumber);
		return s != null ? true : false;
	}
}