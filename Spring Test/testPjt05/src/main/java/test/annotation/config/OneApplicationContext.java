package test.annotation.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({TwoApplicationContext.class, ThreeApplicationContext.class})
public class OneApplicationContext {
	@Bean
	public Developers developers() {
		List<String> list = new ArrayList<String>();
		list.add("Lee");
		list.add("Kim");
		list.add("Park");
		return new Developers(list);
	}
	
	@Bean
	public DeveloperMoneys developerMoneys() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Lee", "����1000��");
		map.put("Kim", "����100��");
		map.put("Park", "����10��");
		return new DeveloperMoneys(map);
	}
}