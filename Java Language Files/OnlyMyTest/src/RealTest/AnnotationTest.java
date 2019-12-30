package RealTest;

class Calculator {
	private int x;
	private int y;
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int add() {
		return this.x + this.y;
	}
	public int sub() {
		return this.x - this.y;
	}
	public int mul() {
		return this.x * this.y;
	}
	public int div() {
		return this.x / this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}

public class AnnotationTest {
	public static void main(String[] args) {
		
	}
}
