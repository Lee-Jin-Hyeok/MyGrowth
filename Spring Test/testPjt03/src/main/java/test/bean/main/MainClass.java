package test.bean.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import test.bean.element.ElementType;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:singletonApplicationContext.xml");
		ElementType element1 = ctx.getBean("element1", ElementType.class);
		ElementType element2 = ctx.getBean("element1", ElementType.class);
		ElementType element3 = ctx.getBean("element2", ElementType.class);
		ElementType element4 = ctx.getBean("element2", ElementType.class);
		
		System.out.println(element1.getElement());
		System.out.println(element2.getElement());
		System.out.println(element3.getElement());
		System.out.println(element4.getElement());
		
		System.out.println(element1 == element2);
		System.out.println(element1.equals(element2));
	}
}