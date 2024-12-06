package com.phwana.day08.recap;

import java.util.Scanner;

//class Student {
//	String name = "";
//	int kor = 0;
//	int eng = 0;
//	int math = 0;
//	
//	public int total() {
//		return kor+eng+math;
//	}
//	
//	public double avg() {
//		return kor+eng+math/3.0;
//	}
//}

public class StudentApp_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		end:
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("====== 성적 입력 ======");
				System.out.print("이름 : ");
				student.name = sc.next();
				System.out.print("국어 : ");
				student.kor = sc.nextInt();
				System.out.print("영어 : ");
				student.eng = sc.nextInt();
				System.out.print("수학 : ");
				student.math = sc.nextInt();
				break;
			case 2: 
				// 출력
				System.out.println("====== 성적 출력 ======");
				System.out.println("이름 : " + student.name);
				System.out.println("국어 : " + student.kor);
				System.out.println("영어 : " + student.eng);
				System.out.println("수학 : " + student.math);
				System.out.println("총점 : " + student.total());
				System.out.println("평균 : " + student.avg());
				break;
			case 3: 
				// 종료
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default : System.out.println("1 ~ 3 사이의 수를 입력해주세요."); break;
			}
		}
	}
}









