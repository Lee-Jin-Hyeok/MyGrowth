package test.di.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import test.di.constructor.ConstructorDI;
import test.di.curiosity.ConstructorMap;
import test.di.list.ListDI;
import test.di.map.MapDI;
import test.di.setter.SetterDI;

public class MainClass {
	public static void main(String[] args) {
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
//		
//		ConstructorDI constructorDI = ctx.getBean("constructorDI", ConstructorDI.class);
//		constructorDI.print();
		
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:setterApplicationContext.xml");
//		
//		SetterDI setterDI = ctx.getBean("setterDI", SetterDI.class);
//		setterDI.print();
		
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:listApplicationContext.xml");
//		
//		ListDI listDI = ctx.getBean("listDI", ListDI.class);
//		listDI.print();
		
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:mapApplicationContext.xml");
//		
//		MapDI mapDI = ctx.getBean("mapDI", MapDI.class);
//		mapDI.print();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:constructorMapApplicationContext.xml");
		
		ConstructorMap constructorMap = ctx.getBean("constructorMap", ConstructorMap.class);
		constructorMap.print();
	}
}