package RealTest;

public class SplitTest {
	public static void main(String[] args) {
		String fruit = "apple-/&banana-/&melon-/&kiwi-/&grape";
		String[] fruits1 = fruit.split("/");
		String[] fruits2 = fruit.split("/", 4);
		
		for(String s : fruits1)
			System.out.println(s);
		System.out.println();
		for(String s : fruits2)
			System.out.println(s);
		
		String test = "-----";
		String[] test2 = test.split("-");
		for(String s : test2)
			System.out.println(s);
	}
}
