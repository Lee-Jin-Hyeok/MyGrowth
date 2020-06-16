package test.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThreeApplicationContext {
	@Bean
	public Box box() {
		return new Box("boxbox");
	}
	
	@Bean
	public Box noArgBox() {
		return new Box();
	}
}