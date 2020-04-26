package test.project.service;

import test.project.dao.StudentDAO;
import test.project.member.Student;

public class StudentRegisterService {
	private StudentDAO studentDAO;
	
	public StudentRegisterService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void register(Student student) {
		String serialNumber = student.getSerialNumber();
		if(verify(serialNumber)) {
			studentDAO.insert(student);
		} else {
			System.out.println("�̹� �����ϴ� �л� �����Դϴ�.");
		}
	}
	
	public boolean verify(String serialNumber) {
		Student s = studentDAO.select(serialNumber);
		return s == null ? true : false;
	}
}