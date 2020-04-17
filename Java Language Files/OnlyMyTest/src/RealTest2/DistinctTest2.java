package RealTest2;

import java.util.Arrays;
import java.util.List;

public class DistinctTest2 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(
				new Integer(1),
				new Integer(2),
				new Integer(1)
		);
		List<String> list3 = Arrays.asList(
				new String("a"),
				new String("b"),
				new String("a")
		);
		
		list1.stream().distinct().forEach(System.out :: println);
		System.out.println();
		list2.stream().distinct().forEach(System.out :: println);
		System.out.println();
		list3.stream().distinct().forEach(System.out :: println);
	}
}