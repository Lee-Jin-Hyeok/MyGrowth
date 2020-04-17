package RealTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit {
	private String name;
	private int sugarContent;
	
	public Fruit(String name, int sugarContent) {
		this.name = name;
		this.sugarContent = sugarContent;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSugarContent() {
		return sugarContent;
	}
}

class HighSugarContentFruit {
	private List<Fruit> list;
	
	public HighSugarContentFruit() {
		list = new ArrayList<Fruit>();
		System.out.println("[" + Thread.currentThread().getName() + "] 생성자");
	}
	
	public void accumulate(Fruit fruit) {
		list.add(fruit);
		System.out.println("[" + Thread.currentThread().getName() + "] 누적");
	}
	
	public void combine(HighSugarContentFruit hscf) {
		list.addAll(hscf.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] 병합");
	}
	
	public List<Fruit> getList() {
		return list;
	}
}

public class CustomContainer {
	public static void main(String[] args) {
		List<Fruit> list = Arrays.asList(
			new Fruit("grape", 10),
			new Fruit("melon", 20),
			new Fruit("apple", 30),
			new Fruit("orange", 40),
			new Fruit("banana", 50)
		);
		
		HighSugarContentFruit hscf = list.stream()
				.filter(f -> f.getSugarContent() >= 30)
				.collect(
					HighSugarContentFruit :: new,
					HighSugarContentFruit :: accumulate,
					HighSugarContentFruit :: combine
				);
		System.out.println();
		
		hscf.getList()
			.stream()
			.forEach(f -> System.out.println(f.getName()));
	}
}
