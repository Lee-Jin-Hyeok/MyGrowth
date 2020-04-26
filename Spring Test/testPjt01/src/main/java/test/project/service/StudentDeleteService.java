package test.project.service;

import test.project.dao.StudentDAO;
import test.project.member.Student;

public class StudentDeleteService {
	private StudentDAO studentDAO;
	
	public StudentDeleteService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void delete(Student student) {
		if(verify(student.getSerialNumber())) {
			studentDAO.delete(student.getSerialNumber());
		} else {
			System.out.println("학생 정보가 존재하지 않습니다.");
		}
	}
	
	public boolean verify(String serialNumber) {
		Student s = studentDAO.select(serialNumber);
		return s != null ? true : false;
	}
}