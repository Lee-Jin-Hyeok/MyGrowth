package project.chess.main;

class AAA {
	private int a;
	
	public AAA(int a) {
		this.a = a;
	}
	
	public void show() {
		System.out.println(this.a);
	}
}

class BBB extends AAA {
	private int b;
	
	public BBB(int b) {
		super(10);
		this.b = b;
	}
	
	public void show() {
		System.out.println(this.b);
	}
}

public class Test {
	public static void main(String[] args) {
		BBB a = new BBB(10);
		a.show();
	}
}