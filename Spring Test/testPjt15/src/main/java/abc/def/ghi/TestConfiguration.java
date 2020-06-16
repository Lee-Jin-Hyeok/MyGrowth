package abc.def.ghi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("abc.def.ghi")
@Configuration
public class TestConfiguration {
	@Bean
	public TestComponent testComponent() {
		return new TestComponent();
	}
}