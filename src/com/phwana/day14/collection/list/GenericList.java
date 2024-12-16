package com.phwana.day14.collection.list;

public class GenericList<T> {//object와 아주 유사 but <>등장
	Object [] objects;
	int size;
	
	public GenericList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T object) {
		objects[size] = object;
		size++;
	}
	
	public T get(int index) {//다양한게 들어올 수 있어요->T
		return(T)objects[index];		
	}
	
	public int size() {//리턴값이 있는 애는 void와 못씀
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
	

}
