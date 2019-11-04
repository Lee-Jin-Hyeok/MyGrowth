package MyTestRoom;

interface Person {
	String getName();
	int getAge();
	void ShowData();
}

class LeeJinHyeok implements Person {
	private String name;
	private int age;
	
	public LeeJinHyeok(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getAge() {
		return this.age;
	}
	@Override
	public void ShowData() {
		System.out.println("[ Á¤º¸ ]");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

public class Test {
	public static void main(String[] args) {
		Person person;
		person = new LeeJinHyeok("lee jin hyeok", 17);
		
		person.ShowData();
	}
}
