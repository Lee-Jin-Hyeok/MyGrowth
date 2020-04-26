package test.project.service;

import test.project.dao.StudentDAO;
import test.project.member.Student;

public class StudentModifyService {
	private StudentDAO studentDAO;
	
	public StudentModifyService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void modify(Student student) {
		if(verify(student.getSerialNumber())) {
			studentDAO.update(student);
		} else {
			System.out.println("학생 정보가 존재하지 않습니다.");
		}
	}
	
	public boolean verify(String serialNumber) {
		Student s = studentDAO.select(serialNumber);
		return s != null ? true : false;
	}
}