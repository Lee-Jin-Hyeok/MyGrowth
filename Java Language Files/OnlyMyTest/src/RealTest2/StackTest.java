package RealTest2;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println("push start");
		System.out.println(stack.push("aa"));
		System.out.println(stack.push("bb"));
		System.out.println(stack.push("cc"));
		System.out.println(stack.push("dd"));
		System.out.println(stack.push("ee"));
		
		System.out.println("peek start");
		System.out.println(stack.peek());
		
		System.out.println("pop start");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("empty start");
		System.out.println(stack.empty());
		
		System.out.println("search start");
		System.out.println(stack.search("aa"));
		System.out.println(stack.search("bb"));
		System.out.println(stack.search("cc"));
		System.out.println(stack.search("dd"));
		System.out.println(stack.search("ee"));
	}
}