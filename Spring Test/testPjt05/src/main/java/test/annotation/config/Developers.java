package test.annotation.config;

import java.util.List;

public class Developers {
	private List<String> developers;
	
	public Developers(List<String> developers) {
		this.developers = developers;
	}
	
	public void setDevelopers(List<String> developers) {
		this.developers = developers;
	}
	
	public List<String> getDevelopers() {
		return developers;
	}
}