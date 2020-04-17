package RealTest2;

import java.util.Arrays;
import java.util.List;

public class FilterTest {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("Lee", "Kim", "Lee", "Kim");
        int[] intStream = { 1, 2, 3 };
        long[] longStream = { 100, 200, 300 };
        double[] doubleStream = { 1.1, 2.2, 3.3 };
        
        list.stream()
            .filter( n -> n.equals("Lee") )
            .forEach( System.out :: println );
        
        Arrays.stream(intStream)
            .filter( n -> n <= 2 )
            .forEach( System.out :: println );
        
        Arrays.stream(longStream)
            .filter( n -> n > 200 )
            .forEach( System.out :: println );
        
        Arrays.stream(doubleStream)
            .filter( n -> true )
            .forEach( System.out :: println );
	}
}