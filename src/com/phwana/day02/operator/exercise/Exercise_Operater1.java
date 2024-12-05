package com.phwana.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operater1 {
	public static void main(String [] args) {
		/*
		 * 정수 하나를 입력받아서 짝수인지 판별하는 프로그램
		 * 
		 * 정수 하나 입력: 4
		 * 짝수 여부: true
		 * 
		 * 정수 하나 입력: 3
		 * 짝수 여부: false
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		boolean result = (num%2 == 0);
		System.out.println(result+"입니다.");
	}

}
