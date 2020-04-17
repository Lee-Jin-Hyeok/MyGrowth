package RealTest2;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomAggregationTest {
	public static void main(String[] args) {
		String string = Stream.of("a", "b", "c")
				.reduce((a, b) -> a + b).get();
		System.out. println(string);
	}
}