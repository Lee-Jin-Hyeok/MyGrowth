package XmlTagsTest;

import java.util.ArrayList;

import com.javalec.ex.MyCalculator;

public class MyState {
	private String name;
	private double height;
	private double weight;
	private String gender;
	private ArrayList<String> hobbys;
	private MyCalculator myCalculator;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public void setMyCalculator(MyCalculator myCalculator) {
		this.myCalculator = myCalculator;
	}
}