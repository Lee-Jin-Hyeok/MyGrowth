package test.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwoApplicationContext {
	@Autowired
	Box box;
	@Autowired
	Box noArgBox;
	
	@Bean
	public WrapperBox wrapperBox() {
		return new WrapperBox(box);
	}
	
	@Bean
	public WrapperBox propertyWrapperBox() {
		return new WrapperBox(noArgBox);
	}
}