package com.phwana.day02.operator;

import java.util.Scanner;

public class Exam_Triplejava {
	public static void main(String []args) {
		/*
		 * 삼항연산자
		 * (조건식) ? 참일 때 : 거짓일 때
		 * String result = (num % 2) == 0 ? "짝수" : "홀수";
		 * System.out.println(result+"입니다.");
		 */
		
		/*
		 * 예제1. 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램
		 */
		
		Scanner sc = new Scanner(System.in);
		//import -> import java.util.Scanner, ctrl+space바를 단어의 끝에 커서를 두고 누름
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result + "입니다.");
	}
}
