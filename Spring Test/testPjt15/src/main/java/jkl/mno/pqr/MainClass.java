package jkl.mno.pqr;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("proxyApplicationContext.xml");
		
		Calculator proxy = (Calculator) ctx.getBean("proxy");
		
		System.out.println(proxy.sum());
		System.out.println(proxy.avg());
		
//		Calculator calculator = new MyCalculator(30, 100, 50, 80);
//		
//		Calculator proxy = (Calculator) Proxy.newProxyInstance(MyCalculator.class.getClassLoader(),
//				new Class[] {Calculator.class},
//				new InvocationHandler() {
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						long start = System.currentTimeMillis();
//						
//						Object result = method.invoke(calculator, args);
//						
//						long end = System.currentTimeMillis();
//						
//						System.out.println((end-start) + "ms 시간이 걸림");
//						
//						return result;
//					}
//				});
//		
	}
}