package test.annotation.config;

public class WrapperBox {
	private Box box;
	
	public WrapperBox() {}
	public WrapperBox(Box box) {
		this.box = box;
	}
	
	public void setBox(Box box) {
		this.box = box;
	}
	
	public Box getBox() {
		return box;
	}
}