package com.phwana.javarecap.student.model.vo;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	
	public Student(
			String name
			, int firstScore
			, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		
	}
	public Student(
			int firstScore
			, int secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		
	}

	public String getName() {
		return name;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}

}
