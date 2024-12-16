package com.phwana.day14.collection.student;

import java.util.List;
import java.util.Scanner;

public class StudentView implements ViewInterface{
	//오버라이딩해서 써야함
	
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("1차 점수");
		int firstScore = sc.nextInt();
		System.out.println("2차 점수");
		int secondScore = sc.nextInt();
		Student student = new Student(name, firstScore, secondScore);
		return student;//컨트롤러에 넘기는 것		
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 관리 프로그램 =====");
		System.out.println("1. 학생 정보 입력");
		System.out.println("1. 학생 정보 출력");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

	@Override
	public void displayStudents(List<Student> stdList) {
		// TODO Auto-generated method stub
		System.out.println("===== 학생 정보 출력 =====");
		for(int i =0; i<stdList.size(); i++)
			System.out.println(stdList.get(i).toString());
	}

	@Override
	public String inputName(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student modifyStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
