package RealTest;

abstract class AAA {
	private int var_private;
	protected int var_protected;
	public int var_public;
	
	public AAA(int var_private, int var_protected, int var_public) {
		this.var_private = var_private;
		this.var_protected = var_protected;
		this.var_public = var_public;
	}
	
	@Deprecated
	abstract public void test();
}

class BBB extends AAA {
	public BBB(int var_private, int var_protected, int var_public) {
		super(var_private, var_protected, var_public);
	}
	@Deprecated
	public void test() {
		//System.out.println("private : " + var_private);
		System.out.println("protected : " + var_protected);
		System.out.println("public : " + var_public);
	}
}

class CCC extends BBB {
	public CCC(int var_private, int var_protected, int var_public) {
		super(var_private, var_protected, var_public);
	}
	
	@Deprecated
	public void test() {
		//System.out.println("private : " + var_private);
		System.out.println("protected : " + var_protected);
		System.out.println("public : " + var_public);
	}
}

public class AccessControlIndicator {
	public static void main(String[] args) {
		//AAA aaa = new AAA(1, 2, 3);
		AAA bbb = new BBB(4, 5, 6);
		AAA ccc = new CCC(7, 8, 9);
		//aaa.test();
		bbb.test();
		ccc.test();
	}
}