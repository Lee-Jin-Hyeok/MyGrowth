package test.di.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClassWithAutowired {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:autowiredApplicationContext.xml");
		
		WrapperBox wrapperBox = ctx.getBean("wrapperBox", WrapperBox.class);
		System.out.println(wrapperBox.getBox().getElement());
		System.out.println(wrapperBox.getBox2().getElement());
		
		int i = wrapperBox.initMethod();
		wrapperBox.destroyMethod();
		wrapperBox.afterPropertiesSet();
		wrapperBox.destroy();
		
		System.out.println(i);
		
		ctx.close();
	}
}