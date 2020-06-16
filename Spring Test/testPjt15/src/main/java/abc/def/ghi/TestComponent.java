package abc.def.ghi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="testComponent")
public class TestComponent {
	@Value("lee")
	private String element;
	
	public TestComponent() {
		this.element = "test";
	}
	
	public void setElement(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}
}