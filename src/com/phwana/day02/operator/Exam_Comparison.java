package com.phwana.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		/*
		 * 비교연산자
		 * >, <, > =, < = 대소비교
		 * ==, ! = 동등비교
		 */
		
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);
		result = (num1 < num2);
		System.out.println(result);
		result = (num1 == num2);
		System.out.println(result);
		result = (num1 != num2);
		System.out.println(result);
	
		/*
		 * num1의 값이 1과 10 사이의 수인지 판별하는 프로그램
		 * 1 < =num1 < = 10 (X) 
		 * 1 < = num1 && num1 < = 10 (O)찢어서 넣어야 함
		 */
	}

}
