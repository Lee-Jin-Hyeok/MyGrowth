package test.project.member;

public class Student {
	private String serialNumber;
	private String id;
	private String password;
	private String name;
	private int age;
	
	public Student(String serialNumber, String id,
			String password, String name, int age) {
		this.serialNumber = serialNumber;
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}