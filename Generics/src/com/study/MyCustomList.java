package com.study;

import java.util.ArrayList;

public class MyCustomList<T /* extends Number - only for numbers inheritanse type */> {

	private ArrayList<T> list;

	public MyCustomList() {
		super();
		this.list = new ArrayList<>();
	}

	static <TYPE> TYPE returnValue(TYPE value) {
		return value;
	}

	public void addElementList(T element) {
		this.list.add(element);
	}

	public void removeElementList(T element) {
		this.list.remove(element);
	}

	@Override
	public String toString() {
		return "MyCustomList [list=" + this.list + "]";
	}

	public T get(int i) {
		return this.list.get(i);
	}

}
