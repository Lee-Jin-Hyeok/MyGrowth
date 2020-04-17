package RealTest2;

import java.util.function.BiConsumer;

class Student2 {
	private String name;
	
	public Student2(String name) {
		this.name = name;
	}
	
	public void instanceMethod(String name) {
		this.name = name;
		System.out.println("name : " + name);
	}
}

public class MethodReferenceTest2 {
	public static void main(String[] args) {
		Student2 student = new Student2("Lee");
		BiConsumer<Student2,String> consumer = Student2 :: instanceMethod;
		consumer.accept(student, "Kim");
	}
}