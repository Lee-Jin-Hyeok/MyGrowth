package MyTestRoom;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.isString("Hello"));
		System.out.println(t.isString(10));
	}
	public int isString(Object obj) {
		if(obj instanceof String)
			return ((String) obj).length();
		else
			return (Integer) null;
	}
}