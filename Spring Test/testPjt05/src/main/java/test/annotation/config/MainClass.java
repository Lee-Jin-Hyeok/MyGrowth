package test.annotation.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// String path = "classpath:applicationContext.xml";
		// GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(OneApplicationContext.class);
		WrapperBox wrapperBox = ctx.getBean("wrapperBox", WrapperBox.class);
		WrapperBox property_wrapperBox = ctx.getBean("propertyWrapperBox", WrapperBox.class);
		Developers developers = ctx.getBean("developers", Developers.class);
		DeveloperMoneys developerMoneys = ctx.getBean("developerMoneys", DeveloperMoneys.class);
		
		System.out.println("-- WrapperBox -- ");
		System.out.println(wrapperBox.getBox().getElement());
		System.out.println("-- WrapperBox -- ");
		System.out.println(property_wrapperBox.getBox().getElement());
		System.out.println("-- Developers -- ");
		List<String> list = developers.getDevelopers();
		for(String s : list)
			System.out.println(s);
		System.out.println("-- DeveloperMoneys --");
		Map<String, String> map = developerMoneys.getDeveloperMoneys();
		Set<String> set = map.keySet();
		for(String s : set)
			System.out.println(map.get(s));
		
		System.out.println(org.springframework.core.SpringVersion.getVersion());
	}
}