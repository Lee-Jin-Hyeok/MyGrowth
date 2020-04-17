package RealTest2;

import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicAggregationTest {
	public static void main(String[] args) {
		Stream<String> stringStream1 = Stream.of("AA", "AB", "AC");
		Stream<String> stringStream2 = Stream.of("AA", "AB", "AC");
		Stream<String> stringStream3 = Stream.of("AA", "AB", "AC");
		Stream<String> stringStream4 = Stream.of("AA", "AB", "AC");
		
		String stringMax = stringStream1.max(Comparator.naturalOrder()).get();
		String stringMin = stringStream2.min(Comparator.naturalOrder()).get();
		String stringFirst = stringStream3.findFirst().get();
		long stringCount = stringStream4.count();
		
		System.out.println("String Max : " + stringMax);
		System.out.println("String Min : " + stringMin);
		System.out.println("String First : " + stringFirst);
		System.out.println("String Count : " + stringCount);
		System.out.println();
		
		IntStream intStream1 = IntStream.of(1, 2, 3);
		IntStream intStream2 = IntStream.of(1, 2, 3);
		IntStream intStream3 = IntStream.of(1, 2, 3);
		IntStream intStream4 = IntStream.of(1, 2, 3);
		IntStream intStream5 = IntStream.of(1, 2, 3);
		IntStream intStream6 = IntStream.of(1, 2, 3);
		
		int intMax = intStream1.max().getAsInt();
		int intMin = intStream2.min().getAsInt();
		int intFirst = intStream3.findFirst().getAsInt();
		long intCount = intStream4.count();
		double intAverage = intStream5.average().getAsDouble();
		int intSum = intStream6.sum();

		System.out.println("Int Max : " + intMax);
		System.out.println("Int Min : " + intMin);
		System.out.println("Int First : " + intFirst);
		System.out.println("Int Count : " + intCount);
		System.out.println("Int Average : " + intAverage);
		System.out.println("Int Sum : " + intSum);
		System.out.println();
		
		DoubleStream doubleStream1 = DoubleStream.of(1.1, 2.2, 3.3);
		DoubleStream doubleStream2 = DoubleStream.of(1.1, 2.2, 3.3);
		DoubleStream doubleStream3 = DoubleStream.of(1.1, 2.2, 3.3);
		DoubleStream doubleStream4 = DoubleStream.of(1.1, 2.2, 3.3);
		DoubleStream doubleStream5 = DoubleStream.of(1.1, 2.2, 3.3);
		DoubleStream doubleStream6 = DoubleStream.of(1.1, 2.2, 3.3);
		
		double doubleMax = doubleStream1.max().getAsDouble();
		double doubleMin = doubleStream2.min().getAsDouble();
		double doubleFirst = doubleStream3.findFirst().getAsDouble();
		long doubleCount = doubleStream4.count();
		double doubleAverage = doubleStream5.average().getAsDouble();
		double doubleSum = doubleStream6.sum();
		
		System.out.println("Double Max : " + doubleMax);
		System.out.println("Double Min : " + doubleMin);
		System.out.println("Double First : " + doubleFirst);
		System.out.println("Double Count : " + doubleCount);
		System.out.println("Double Average : " + doubleAverage);
		System.out.println("Double Sum : " + doubleSum);
	}
}