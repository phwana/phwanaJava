package com.phwana.day09.oop;
//static 다 빼야함
public class Student {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	public int total() {
		return kor+eng+math;
	}
	
	public double avg() {
		return this.total()/3.0;
	}
}
