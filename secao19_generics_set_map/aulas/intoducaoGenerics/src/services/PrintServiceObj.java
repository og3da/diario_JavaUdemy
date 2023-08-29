package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceObj {
	
	private List<Object> list = new ArrayList<>();

	public PrintServiceObj() {}

	public List<Object> getList() {
		return list;
	}

	//methods
	public void addValue(Object value) {
		list.add(value);
	}
	
	public Object first() {
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}
	
}
