package test.di.autowired;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Box2 implements InitializingBean, DisposableBean {
	private String element;

	public Box2(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}

	public void destroy() {
		System.out.println("Box2 Destroy");
	}

	public void afterPropertiesSet() {
		System.out.println("Box2 Init");
	}
	
	public void initMethod() {
		System.out.println("Box2 InitMethod");
	}
	
	public void destroyMethod() {
		System.out.println("Box2 DestoryMethod");
	}
}