package com.phwana.day14.collection.student;

//값이 있는 Value Object
//VO
public class Student {
	//필드
	private String name;
	private int firstScore;
	private int secondScore;
	
	//생성자
	public Student(){}//몸체가 있고 반환형이 x
	
	//매개변수 있는 생성자
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	//메소드
	//getter/setter
	public String getName(){
		return name;
	}
	public void setName(String name){//세터는 전달받아서 매개변수있다
		this.name = name;
		//return;
	}

	//Alt+Shift+S키->generate 들 자동완성 기능!!
	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	// toString();
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
}