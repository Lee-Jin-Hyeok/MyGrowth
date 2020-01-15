package RealTest;

public class ParameterTest {
	public static void main(String[] args) {
		ParameterTest pt = new ParameterTest();
		System.out.println(pt.add('A', 1,2));
		System.out.println(pt.add('B', 1, 2, 3));
	}
	public int add(char a, int ... is) {
		int sum = 0;
		for(int i = 0 ; i < is.length ; i++)
			sum += is[i];
		return sum;
	}
}
