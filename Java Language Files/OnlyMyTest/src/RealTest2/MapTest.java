package RealTest2;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.put(1, "1"));
		System.out.println(map.put(2, "2"));
		System.out.println(map.put(2, "3"));
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("1"));
		System.out.println(map.containsValue(3));
	}
}