package test.project.dao;

import java.util.HashMap;
import java.util.Map;
import test.project.member.Student;

public class StudentDAO {
	private Map<String, Student> studentDB = new HashMap<>();
	
	public void insert(Student student) {
		studentDB.put(student.getSerialNumber(), student);
	}
	
	public Student select(String serialNumber) {
		return studentDB.get(serialNumber);
	}
	
	public void update(Student student) {
		studentDB.put(student.getSerialNumber(), student);
	}
	
	public void delete(String serialNumber) {
		studentDB.remove(serialNumber);
	}
	
	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
}