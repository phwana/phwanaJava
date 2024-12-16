package com.phwana.day14.collection.list;

public class ObjectList {
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	//전달 '받아서' 쓰면 매개변수 있는 것
	public void add(Object Object) {
		objects[size]=Object;
		size++;
	}
	
	//몇번째인지 '받아서' 하니까 매개변수 존재
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size=0;
	}
	

}
