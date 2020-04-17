package RealTest2;

import java.util.Arrays;

class NaturalSciences {
	private String name;
	
	public NaturalSciences(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class Science extends NaturalSciences {
	private String name;
	
	public Science(String name) {
		super(name);
		this.name = name;
	}
}

class Math extends NaturalSciences {
	private String name;
	
	public Math(String name) {
		super(name);
		this.name = name;
	}
}

class Math1 extends Math {
	private String name;
	
	public Math1(String name) {
		super(name);
		this.name = name;
	}
}

class School<T> {
	private String name;
	private T[] subject;
	private static int cnt;
	
	public School(String name, int count) {
		this.name = name;
		this.subject = (T[])(new Object[count]);
		this.cnt = 0;
	}
	
	public void add(T t) {
		subject[cnt++] = t;
	}
	
	public String getName() {
		return name;
	}
	
	public T[] getSubject() {
		return subject;
	}
}

public class WildcardTypeTest {
	public static void plusMinus(School<?> school) {
		System.out.println(school.getName() + " 과목 : " + Arrays.toString(school.getSubject()));
	}
	
	public static void differential(School<? extends Math> school) {
		System.out.println(school.getName() + " 과목 : " + Arrays.toString(school.getSubject()));
	}
	
	public static void science(School<? super Science> school) {
		System.out.println(school.getName() + " 과목 : " + Arrays.toString(school.getSubject()));
	}
	
	public static void main(String[] args) {
		School<NaturalSciences> naturalSciences = new School<>("이과", 4);
		naturalSciences.add(new NaturalSciences("이과"));
		naturalSciences.add(new Science("과학"));
		naturalSciences.add(new Math("수학"));
		naturalSciences.add(new Math1("수학1"));
		
		School<Science> science = new School<>("과학", 4);
		science.add(new Science("과학"));
		
		School<Math> math = new School<>("수학", 4);
		math.add(new Math("수학"));
		math.add(new Math1("수학1"));
		
		School<Math1> math1 = new School<>("수학1", 5);
		math1.add(new Math1("수학1"));
		
		
		plusMinus(naturalSciences);
		plusMinus(science);
		plusMinus(math);
		plusMinus(math1);
		System.out.println();
		
		// differential(naturalSciences);
		// differential(science);
		differential(math);
		differential(math1);
		System.out.println();
		
		science(naturalSciences);
		science(science);
		// science(math);
		// science(math1);
	}
}
