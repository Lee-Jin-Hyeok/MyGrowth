package RealTest;

public class StringMethod {
	public static void main(String[] args) {
		String str2 = new String("string string");
		System.out.println(str2.replace("string", "���ڿ�"));
		System.out.println(str2.replaceFirst("string", "���ڿ�"));
		
		byte data = 10;
		System.out.println(String.valueOf(data));
		
		Temp t = new Temp();
		System.out.println(String.valueOf(t));
	}
}

class Temp {
	
}