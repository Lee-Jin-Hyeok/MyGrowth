package Utility;

import RealTest.AccessControlIndicatorTest;

public class AccessControlIndicatorTest2 {
	public AccessControlIndicatorTest2(int a) {
		System.out.println("생성자 호출");
		this.a = a;
	}
	private int a;
	
	public void Test() {
		AccessControlIndicatorTest aci = new AccessControlIndicatorTest();
		ACIT3 acit = new ACIT3();
	}
}
