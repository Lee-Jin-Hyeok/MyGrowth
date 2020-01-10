package RealTest;

public class EqualsTest {
	public static void main(String[] args) {
		String string1 = "equals";
		String string2 = "equals";
		String string3 = new String("equals");
		
		System.out.println(string1 == string2);
		System.out.println(string1 == string3);
		System.out.println(string1.equals(string3));
		System.out.println(string1.equals("equals"));
		
		System.out.println("1".equals(1));
		
		int[] a = new int[3];
		for(int i : a)
			System.out.println(i);
		
		// int[2] b = new int[2];
		
		int[] b = { 1, 2, 3 };
		int[] c = new int[3];
		System.arraycopy(b, 0, c, 0, 3);
		
		for(int i : c)
			System.out.println(i);
		
		System.out.println(b == c);
	}
}
