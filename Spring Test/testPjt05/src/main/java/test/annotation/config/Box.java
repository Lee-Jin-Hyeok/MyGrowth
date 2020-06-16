package test.annotation.config;

public class Box {
	private String element;
	
	public Box() {
		this.element = "Default Element";
	}
	
	public Box(String element) {
		this.element = element;
	}
	
	public void setElement(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}
}