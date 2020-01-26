package RealTest;

class Obj {
	private int field;
	
	public Obj(int field) {
		this.field = field;
	}
	
	public void print() {
		System.out.println("field : " + field);
	}
}

public class EqualsTest2 {
	public static void main(String[] args) {
		Obj obj1 = new Obj(10);
		Obj obj2 = new Obj(20);
		
		System.out.println(obj1.equals(obj2));
		
		String str1 = "dd";
		String str2 = "dd";
		String str3 = new String("dd");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
