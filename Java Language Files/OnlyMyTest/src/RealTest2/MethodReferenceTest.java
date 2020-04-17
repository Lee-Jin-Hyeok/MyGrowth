package RealTest2;

import java.util.function.BiConsumer;

class MethodReference {
	public static void staticMethod(String string1, String string2) {
		System.out.println(string1 + " " + string2);
	}
	public void instanceMethod(String string1, String string2) {
		System.out.println(string1 + " " + string2);
	}
}

public class MethodReferenceTest {
	public static void main(String[] args) {
		MethodReference mr = new MethodReference();
		
		BiConsumer<String,String> bc1 = (arg1, arg2) -> MethodReference.staticMethod(arg1, arg2);
		BiConsumer<String,String> bc2 = MethodReference :: staticMethod;
		bc1.accept("dd", "aa");
		bc2.accept("dd", "aa");
		
		BiConsumer<String,String> bc3 = (arg1, arg2) -> mr.instanceMethod(arg1, arg2);
		BiConsumer<String,String> bc4 = mr :: instanceMethod;
		bc3.accept("dd", "aa");
		bc4.accept("dd", "aa");
	}
}