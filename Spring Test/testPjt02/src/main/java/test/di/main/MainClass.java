package test.di.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import test.di.constructor.ConstructorDI;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		ConstructorDI constructorDI = ctx.getBean("constructorDI", ConstructorDI.class);
		constructorDI.print();
	}
}