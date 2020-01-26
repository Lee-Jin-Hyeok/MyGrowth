package RealTest;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String fruit = "apple-/& banana-/& melon-/& kiwi-/& grape";
		StringTokenizer st = new StringTokenizer(fruit, "/");
		
		System.out.println(st.countTokens());

		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken("-"));
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		String test = "-----";
		StringTokenizer st2 = new StringTokenizer(test, "-");
		System.out.println(st2.countTokens());
	}
}
