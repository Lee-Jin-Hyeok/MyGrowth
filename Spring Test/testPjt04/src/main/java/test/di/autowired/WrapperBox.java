package test.di.autowired;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WrapperBox implements InitializingBean, DisposableBean {
	private Box box;
	private Box2 box2;

	public WrapperBox() {}
	public WrapperBox(Box box, Box2 box2) {
		this.box = box;
		this.box2 = box2;
	}

	@Autowired
	@Qualifier(value="aaa")
	public void setBox(Box box, Box2 box2) {
		this.box = box;
		this.box2 = box2;
	}
	
	public Box getBox() {
		return box;
	}
	
	public Box2 getBox2() {
		return box2;
	}
	
	public void destroy() {
		System.out.println("WrapperBox Destroy");
	}
	
	public void afterPropertiesSet() {
		System.out.println("WrapperBox Init");
	}
	
	public int initMethod() {
		System.out.println("WrapperBox InitMethod");
		return 1;
	}
	
	public void destroyMethod() {
		System.out.println("WrapperBox DestoryMethod");
	}
}
