package com.phwana.day08.recap;

import java.util.Scanner;

class Student{
//배열의 공간을 늘여도 int에 String이 못 들어가는데 이걸 가능하게 하는게 class
	static String name="";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
//	double avg = 0;
	
	public static int total() {
		return kor+eng+math;
	}
	public static double avg() {
		return kor+eng+math/3.0;//return형이고 매개변수 없다
	}
}
public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
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
				student.name=sc.next(); //문자라 int뺌
				System.out.print("국어 : ");
				student.kor=sc.nextInt();
				System.out.print("영어 : ");
				student.eng=sc.nextInt();
				System.out.print("수학 : ");
				student.math=sc.nextInt();
				student.avg = student.avg;
				break;
			case 2: 
				System.out.println("======성적 출력======");
				System.out.print("이름 : "+student.name);
				System.out.print("국어 : "+student.kor);
				System.out.print("영어 : "+student.eng);
				System.out.print("수학 : "+student.math);
				System.out.println("총점 : "+student.total);
				System.out.println("평균 : "+student.avg);
				
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break end;
				//종료
				
				default : System.out.println("1~3 사이의 수를 입력해주세요.");
				break;
	}
}
	}
}

