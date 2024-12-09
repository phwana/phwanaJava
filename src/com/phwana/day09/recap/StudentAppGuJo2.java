package com.phwana.day09.recap;

import java.util.Scanner;

public class StudentAppGuJo2 {
	static Scanner sc = new Scanner(System.in);
	Student [] students = new Student[3];
	//Student student = new Student();
	public static void main(String[] args) {
	
		while(true) { //한줄로 바꾼다 -> 메소드로 바꾼다
			int choice = printMenu();
						
			switch(choice) {
			case 1:
				inputStudentData();
				break;
			case 2:
				printStudentData();
				break;
			case 3:
				displayMessage("프로그램이 종료되었습니다.");
				break;
			default : 
				displayMessage("1 ~ 3 사이의 수를 입력해주세요."); 
				break;
			}
		}
	}
	static int printMenu() { //필드화? 메인안에서 동작해서 모두다 static을 붙이고 있다
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice; //리턴형을 정리하고 코드 작성하고 메소드 이용해서 분기처리 할 수 있게
	}
	static void inputStudentData(){//메소드는 일단 리턴, 매개변수 없는 형으로 시작
		System.out.println("====== 성적 입력 ======");
		System.out.print("이름 : ");
		Student.name = sc.next();	//new로 student 생성했어야 했다!
		System.out.print("국어 : ");
		Student.kor = sc.nextInt(); //static바꾸면서 대문자
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		System.out.print("수학 : ");
		Student.math = sc.nextInt();
	}
	static void printStudentData(){//메인 메소드 안에 하다보니까 다 static 붙여줌
		System.out.println("====== 성적 출력 ======");
		System.out.println("이름 : " + Student.name);
		System.out.println("국어 : " + Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math);
		System.out.println("총점 : " + Student.total());	//'메소드'에는 소괄호 붙는다!!
		System.out.println("평균 : " + Student.avg());
	}
	static void displayMessage(String message) {
		System.out.println(message);//한개에서 두개(case3 종료/다시) 나올 수 없어서 매개변수를 만들어
	}
}
//객체배열: 참조형으로 배열을 만든다
