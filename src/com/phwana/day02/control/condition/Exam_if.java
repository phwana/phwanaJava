package com.phwana.day02.control.condition;

import java.util.Scanner;

public class Exam_if {
	public static void main(String []args) {
		/*
		 * 제어문 - 조건문
		 * 문법
		 * if ( 조건식 ) { 실행문장; }
		 * else { 실행문장2; }
		 */
		//예제. 입력받은 정수가 0보다 큰지 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 :");
		int input = sc.nextInt();
		if(input > 0) {
			System.out.println("크다.");
		}else {
			System.out.print("크지 않다.");
		}
		//예제2. 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램
		System.out.print("정수 하나 입력 :");
		input = sc.nextInt();                    //중복이어도 써야함
		if(input % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		//예제3. 입력받은 정수가 양의정수인지, 음의정수인지 아니면 0인지 판별
		System.out.print("정수 하나 입력 : ");
		input = sc.nextInt();
		
	//		if(input > 0) {
	//		System.out.println("양의 정수입니다.");
	//	}else if(input < 0);
	//		System.out.println("음의 정수입니다.");
	//	}else {
	//		if(input == 0) {
	//	System.out.println("0입니다.");
	//	}
		
		//삼항연산자로
		/*
		 * 중첩 삼항연산, 중첩 if 와 유사
		 */
		String result = (input == 0) ? "0" : ((input<0) ? "음의 정수" : "양의 정수");
		System.out.println(result+"입니다.");
		
//		if(input == 0) {
//			System.out.println("0입니다.");
//		}else {
//		String result = ( input>0 ? "양의 정수" : "음의 정수");
//		System.out.println(result+"입니다.");
//		}
		}
}
