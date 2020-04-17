package testPjt01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TranspotationWalk tw = new TranspotationWalk();
//		tw.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TranspotationWalk tw = ctx.getBean("tWalk", TranspotationWalk.class);
		tw.move();
		
		ctx.close();
	}
}