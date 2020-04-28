package test.di.curiosity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConstructorMap {
	// private Map<String,String> map;
	private List<String> list;
	
//	public ConstructorMap(Map<String,String> map) {
//		this.map = map;
//	}
	public ConstructorMap(List<String> list) {
		this.list = list;
	}
	
//	public void print() {
//		Set<String> set = map.keySet();
//		for(String s : set) {
//			System.out.println("Key : " + s + ", Value : " + map.get(s));
//		}
//	}
	public void print() {
		for(String s : list) {
			System.out.println(s);
		}
	}
}