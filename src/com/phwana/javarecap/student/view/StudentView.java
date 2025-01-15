package com.phwana.javarecap.student.view;

import java.util.List;
import java.util.Scanner;

import com.phwana.javarecap.student.model.vo.Student;

public class StudentView {

	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 정보 입력 =======");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("1차 점수: ");
		int firstScore = sc.nextInt();
		System.out.println("2차 점수: ");
		int secondScore = sc.nextInt();
		Student student = new Student(name, firstScore, secondScore);
		return student;
	}
	
	

	public int printMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("======= 학생 관리 프로그램 =====");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 조회");
		System.out.println("5. 학생 정보 검색(이름)");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printAllStudents(List<Student> sList) {
		System.out.println("======= 학생 전체 정보 조회 =======");
		for (Student student : sList) {
			System.out.println("이름: " + student.getName());
			System.out.println("1차점수 : " + student.getFirstScore());
			System.out.println("1차점수 : " + student.getSecondScore());
		}
	}

	public String inputName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println(category + "할 이름 입력: ");
		String name = sc.next();
		return name;
	}



	public Student modifyScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1차 점수 입력 : ");
		int firstScore = sc.nextInt();
		System.out.println("2차 점수 입력 : ");
		int secondScore = sc.nextInt();
		Student student = new Student(firstScore, secondScore);
		return student;
	}

}
