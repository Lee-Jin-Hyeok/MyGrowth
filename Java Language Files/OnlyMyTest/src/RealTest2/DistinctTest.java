package RealTest2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student3 {
	private String name;
	private Integer number;
	
	public Student3(String name, Integer number) {
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

	@Override
	public boolean equals(Object obj) {
		System.out.println("dd");
		if(obj instanceof Student3) {
			Student3 student = (Student3) obj;
			return student.getName().equals(getName()) && student.getNumber() == getNumber();
		} else {
			return false;
		}
	}
}

public class DistinctTest {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(
				new Student3("Lee", 10),
				new Student3("Kim", 20),
				new Student3("Lee", 10),
				new Student3("Lee", 20));
		
		list.stream().distinct().forEach(n -> System.out.println("name : " + n.getName() + ", number : " + n.getNumber()));
	}
}