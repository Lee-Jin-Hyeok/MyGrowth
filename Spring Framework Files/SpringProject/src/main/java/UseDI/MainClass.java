package UseDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:pencilCTX.xml");
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		
		ctx.close();
	}
}

/*
	interface를 이용해서 Pencil4B, Pencil6B, Pencil6BWithEraser를 각각 구현하게 되면
	main에서는 코드 변화 없이 xml 파일만을 이용해서 값을 변경할 수 있다.
*/