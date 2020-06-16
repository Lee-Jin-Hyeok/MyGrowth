package test.annotation.config;

import java.util.Map;

public class DeveloperMoneys {
	private Map<String, String> developerMoneys;
	
	public DeveloperMoneys(Map<String, String> developerMoneys) {
		this.developerMoneys = developerMoneys;
	}
	
	public void setDeveloperMoneys(Map<String, String> developerMoneys) {
		this.developerMoneys = developerMoneys;
	}
	
	public Map<String, String> getDeveloperMoneys() {
		return developerMoneys;
	}
}