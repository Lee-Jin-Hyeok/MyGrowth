package RealTest;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.toString());
		sb.insert(2, "iii");
		System.out.println(sb.toString());
	}
}
