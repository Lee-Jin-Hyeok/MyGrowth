package test.di.setter;

public class SetterDI {
	private String string;
	private Integer integer;
	private Element element;
	
	public SetterDI() {}
	public void setString(String string) {
		this.string = string;
	}
	public void setInteger(Integer integer) {
		this.integer = integer;
	}
	public void setElement(Element element) {
		this.element = element;
	}
	public void print() {
		System.out.println("String : " + string);
		System.out.println("Integer : " + integer);
		System.out.println("Element : " + element.getElement());
	}
}