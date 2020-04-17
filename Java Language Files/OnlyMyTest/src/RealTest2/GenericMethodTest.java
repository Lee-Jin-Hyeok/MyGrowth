package RealTest2;

class Box<T> {
	private T content;
	
	public Box(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}
}

class Wrapper {
	private Box box;
	
	public <T> void wrapping(T content) {
		box = new Box<T>(content);
	}
	
	public Box getBox() {
		return box;
	}
}

public class GenericMethodTest {
	public static void main(String[] args) {
		Wrapper wrapper = new Wrapper();
		wrapper.wrapping(100);
		Box box = wrapper.getBox();
		System.out.println(box);
		System.out.println(box.getContent());
	}
}
