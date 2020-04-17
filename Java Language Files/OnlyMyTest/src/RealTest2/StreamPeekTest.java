package RealTest2;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPeekTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(9, 8, 7, 6, 5, 4, 3, 2, 1);
		
		stream.peek(s -> System.out.println("원본 스트림 : " + s))
		.sorted()
		.peek(s -> System.out.println("sorted() 실행 후 : " + s))
		.skip(2)
		.peek(s -> System.out.println("skip(2) 실행 후 : " + s))
		.limit(5)
		.peek(s -> System.out.println("limit(5) 실행 후 : " + s))
		.sorted(Comparator.reverseOrder())
		.peek(s -> System.out.println("sorted2() 실행 후 : " + s))
		.forEach(System.out :: println);
		
		System.out.println();
		
		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5);
		
		stream2.peek(s -> System.out.println("Peek1 : " + s))
		.skip(2)
		.peek(s -> System.out.println("Peek2 : " + s))
		.skip(2)
		.peek(s -> System.out.println("Peek3 : " + s))
		.forEach(System.out :: println);
		
		System.out.println();
		
		IntStream stream3 = IntStream.of(1, 2, 3);
		
		stream3.peek(s -> s = s * 2)
		.forEach(System.out :: println);
		
		IntStream stream4 = IntStream.of(1, 2, 3);
		stream4.peek(System.out :: println);
	}
}