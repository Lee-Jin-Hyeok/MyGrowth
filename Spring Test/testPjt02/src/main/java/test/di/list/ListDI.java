package test.di.list;

import java.util.List;

public class ListDI {
	private List<ListElement> list;
	
	public ListDI() {}
	
	public void setList(List<ListElement> list) {
		this.list = list;
	}
	
	public void print() {
		for(ListElement s : list) {
			System.out.println(s.getElement());
		}
	}
}