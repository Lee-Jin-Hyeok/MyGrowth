package jkl.mno.pqr;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start = System.currentTimeMillis();

		try {
			Thread.sleep(2000);
		} catch(Exception e) {}
		
		Object result = invocation.proceed();
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start) + "ms 시간이 걸림");
		
		return result;
	}
}