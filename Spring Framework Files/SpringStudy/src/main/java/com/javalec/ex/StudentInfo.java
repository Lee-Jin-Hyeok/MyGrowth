package com.javalec.ex;

public class StudentInfo {
	private Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		if(student != null) {
			System.out.println("이름 : " + student.getName());
			System.out.prinltn("나이 : " + student.getAge());
		}
	}
}