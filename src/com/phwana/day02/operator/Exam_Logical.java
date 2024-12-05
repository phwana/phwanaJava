package com.phwana.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		/*
		 * 논리연산자
		 * 조건 2개 이상의 경우 조건의 결과를 연결
		 * 1. 남자이면서 평균평점 4.0이상인 사람
		 * 2. 컴퓨터공학과 또는 경영학과인 사람
		 */
		
		boolean result1, result2, result3, result4;
		// AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) || (num1 < num2);
		result2 = (num1 < num2) || (num1 == num2);
		result3 = (num1 > num2) && (num1 != num2); //t
		result4 = (num1 > num2) || (num1 == num2); //t
		
		System.out.println("결과값1: "+result1);
		System.out.println("결과값2: "+result2);
		System.out.println("결과값3: "+result3);
		System.out.println("결과값4: "+result4);
		
		/*
		 * 문제
		 * a는 70, b는 55입니다
		 * result1 = (a == b) || (a++ < 100); f||t(70<100) -> t //a=71
		 * result2 = (a < b) && (--b < 55); f(71<55) && X -> f //b=55
		 * result3 = (a !=b) && (b-- < a++); t(71!=55) & X-> t //a=72, b=54
		 * result4 = (a++ != b) || (b++ >= 85); t(72!=54) || X(뒷연산 안하기 때문에! *b=54) -> t=  //a=73, b=54
		 * a,b의 값을 예상해보세요. 73, 54
		 */
		
		int a = 70;
		int b = 55;
		result1 = (a == b) || (a++ < 100);
		result2 = (a < b) && (--b < 55);
		result3 = (a !=b) && (b-- < a++);
		result4 = (a++ != b) || (b++ >= 85);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(a);
		System.out.println(b);
	}

}
