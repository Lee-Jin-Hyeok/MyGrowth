package abc.def.ghi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestJUnit {
	@Test
	public void test() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfiguration.class);
		TestComponent tc = ctx.getBean("testComponent", TestComponent.class);
		System.out.println(tc.getElement());
	}
}