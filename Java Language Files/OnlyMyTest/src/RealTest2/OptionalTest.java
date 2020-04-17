package RealTest2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class OptionalTest {
	public static void main(String[] args) {
		int[] intArray = {1};
		OptionalInt oi = Arrays.stream(intArray).max();
		System.out.println(oi);
		System.out.println(oi.getAsInt());
		System.out.println(oi.getAsInt());
		System.out.println(oi.orElse(10));
		System.out.println(oi.getAsInt());
	}
}