package test.di.map;

import java.util.Map;
import java.util.Set;

public class MapDI {
	private Map<String, String> map;
	
	public MapDI() {}
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public void print() {
		Set<String> set = map.keySet();
		for(String s : set) {
			System.out.println("Key : " + s + ", Value : " + (map.get(s)).trim());
		}
	}
}