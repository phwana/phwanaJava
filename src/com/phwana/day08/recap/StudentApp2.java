package com.phwana.day08.recap;

import java.util.Scanner;

//class Student{
////배열의 공간을 늘여도 int에 String이 못 들어가는데 이걸 가능하게 하는게 class
//	static String name="";
//	static int kor = 0;
//	static int eng = 0;
//	static int math = 0;
//	static double avg = 0;
//}//스테틱변수를 쓰기위해 객체가 되면됨?

// 구조적 프로그래밍
public class StudentApp2 {
	static Scanner sc = new Scanner(System.in);
	//스캐너 한칸 올려 '필드(멤버변수; 클래스 내 모든 메서드에서 접근 가능하다)'가 된다
	//스태틱을 붙여줘야 한다(따로 만들었으면 안붙여도 됨)-스태틱 안에서는 스태틱만 호출 가능
//	Student student = new Student();
	//위로 올려 필드field가 만들어짐(메인위로)
//	static int choice =0; 초이스의 또다른처리
	
	public static void main(String[] args) {
		end:
		while(true) {
			int choice = printMenu();
			switch(choice) {
//			System.out.println("====== 메인 메뉴 ======");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적출력");
//			System.out.println("3. 종료");
//			System.out.print("선택 >> ");
//			
//			int choice = sc.nextInt();
			
			case 1: 
				 inputStudentData();
//				System.out.println("====== 정보 입력 ======");
//				System.out.print("이름 : ");
//				student.name=sc.next(); //문자라 int뺌
//				System.out.print("국어 : ");
//				student.kor=sc.nextInt();
//				System.out.print("영어 : ");
//				student.eng=sc.nextInt();
//				System.out.print("수학 : ");
//				student.math=sc.nextInt();
//				student.avg = (student.kor + student.eng+student.math)/3.0;
				break;
			case 2: 
				// 출력
				 printStudentData();
//				System.out.println("======정보 출력======");
//				System.out.print("이름 : "+student.name);
//				System.out.print("국어 : "+student.kor);
//				System.out.print("영어 : "+student.eng);
//				System.out.print("수학 : "+student.math);
//				System.out.println("총점 : "+(student.kor + student.eng+student.math));
//				System.out.println("평균 : "+(student.kor + student.eng+student.math)/3.0);
				
				break;
			case 3:
				 displayMessage();
//				System.out.println("프로그램이 종료되었습니다.");
				break end;
				//종료
				// displayMessage();
//				default : System.out.println("1~3 사이의 수를 입력해주세요.");
				
			default : System.out.println("1~3 사이의 수를 입력해주세요.");
			}
		}
	}
	// printMenu()
		static int printMenu() { //public 생략가능
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			
			int choice = sc.nextInt();
			return choice;
		}
	// inputStudentData()
		static void inputStudentData() {
			System.out.println("====== 정보 입력 ======");
			System.out.print("이름 : ");
			Student.name=sc.next(); //문자라 int뺌
			System.out.print("국어 : ");
			Student.kor=sc.nextInt();
			System.out.print("영어 : ");
			Student.eng=sc.nextInt();
			System.out.print("수학 : ");
			Student.math=sc.nextInt();
//			Student.avg = (Student.kor + Student.eng+Student.math)/3.0;
		}
	// printStudentData()
		static void printStudentData() {
			System.out.println("======정보 출력======");
			System.out.print("이름 : "+Student.name);
			System.out.print("국어 : "+Student.kor);
			System.out.print("영어 : "+Student.eng);
			System.out.print("수학 : "+Student.math);
			System.out.println("총점 : "+(Student.kor + Student.eng+Student.math));
			System.out.println("평균 : "+(Student.kor + Student.eng+Student.math)/3.0);
		}
	// displayMessage();
		static void displayMessage() {
			System.out.println("프로그램이 종료되었습니다.");
		}
}
