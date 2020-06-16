package test.di.autowired;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Box implements InitializingBean, DisposableBean {
	private String element;
	
	public Box(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}

	public void destroy() {
		System.out.println("Box Destroy");
	}

	public void afterPropertiesSet() {
		System.out.println("Box Init");
	}
	
	public void initMethod() {
		System.out.println("Box InitMethod");
	}
	
	public void destroyMethod() {
		System.out.println("Box DestoryMethod");
	}
}