package RealTest2;

import java.util.function.Consumer;

class Student {
	private String name;
	private Integer number;
	
	public Student(String name, Integer number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
}

public class AndThenComposeTest {
	public static void main(String[] args) {
		Consumer<Student> consumer1 = s -> System.out.println(s.getName());
		Consumer<Student> consumer2 = s -> System.out.println(s.getNumber());
		Consumer<Student> consumer3 = consumer1.andThen(consumer2);

		consumer3.accept(new Student("Lee", 16));
	}
}