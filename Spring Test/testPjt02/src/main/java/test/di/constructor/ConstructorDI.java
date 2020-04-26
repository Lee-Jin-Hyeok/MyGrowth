package test.di.constructor;

public class ConstructorDI {
	// private Element1 element1;
	// private Element2 element2;
	private String element1;
	private Integer element2;
	
//	public ConstructorDI(Element1 element1, Element2 element2) {
//		this.element1 = element1;
//		this.element2 = element2;
//	}
	
	public ConstructorDI(String element1, Integer element2) {
		this.element1 = element1;
		this.element2 = element2;
	}
	
//	public void print() {
//		System.out.println("Element1 : " + element1.getElement());
//		System.out.println("Element2 : " + element2.getElement());
//	}
	
	public void print() {
		System.out.println("Element1 : " + element1);
		System.out.println("Element2 : " + element2);
	}
}