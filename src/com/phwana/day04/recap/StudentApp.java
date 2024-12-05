package com.phwana.day04.recap;

import java.util.Scanner;

public class StudentApp {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 무한반복을 하기 위한 반복문
		// 1. for(;;)  {}
		// 2. while(true) {}
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			
			switch(choice) {//'지역변수'의 기준은 중괄호-> 선언을 먼저!!
			case 1: 
					System.out.println("====== 성적 입력 ======");
					System.out.print("국어 : ");
					kor = sc.nextInt();
					System.out.print("영어 : ");
					eng = sc.nextInt();
					System.out.print("수학 : ");
					math = sc.nextInt();
				break;
				
			case 2: 
					System.out.println("====== 성적 출력 ======");
					
					System.out.println("국어 : "+kor);
					System.out.println("영어 : "+eng);
					System.out.println("수학 : "+math);
					
					int sum = 0;
					sum = kor + eng + math;
					System.out.println("총점 : "+sum);
					
					double avg = 0;
					int count = 3;
					avg = sum / count;
					System.out.println("평균 : "+avg);
				break;
				// 빨간줄: 컴파일 오류, 디버깅: 정상 동작이나 의도치 않은 결과
			case 3:
				System.out.println("프로그램이 종료되었습니다"); 
				return;
				
			default: System.out.println("1~3 사이의 수를 입력해주세요");	
		}
		}
	}
}
