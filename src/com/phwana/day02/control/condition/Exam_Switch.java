package com.phwana.day02.control.condition;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String [] args) {
		/*
		 * 제어문 - 조건문
		 * switch문
		 * 문법
		 * switch(변수){
		 * 		case 변수 예상값 :
		 * 				실행문1;
		 * 				break;
		 * 		case 변수 예상값2 :
		 * 				실행문2;
		 * 				break;
		 * ex)
		 * switch(num){
		 * 		case1: 실행문1; break;
		 * 		case2: 실행문2; break;
		 * 		case3: 실행문3; break;
		 * 		default: 실행문0;
		 * }
		 * ->if~else if~else와 대응되는 구문: 완전 대체가능?
		 */
		
		// 예제. 정수를 입력받아 입력한 값이 1이면 빨간색, 2이면 노란색, 3이면 초록색을 출력하는 프로그램
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.print("빨간색"); break;
		case 2: System.out.print("노란색"); break;
		case 3: System.out.print("초록색"); break;
		default: System.out.print("1~3 사이의 수를 입력하세요.");
		}
	}

}
