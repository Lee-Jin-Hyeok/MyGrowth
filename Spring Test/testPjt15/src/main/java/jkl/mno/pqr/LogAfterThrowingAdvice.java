package jkl.mno.pqr;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("예외 발생");
	}
}