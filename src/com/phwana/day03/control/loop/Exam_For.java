package com.phwana.day03.control.loop;

public class Exam_For {
	public static void main(String []args) {
		/*
		 * 반복문: 실행문장을 원하는 횟수만큼 반복
		 * -문법:
		 * for(초기식; 조건식; 반복작업할 증감식) { 실행문장;}
		 */
		
//		System.out.println("Hello World"); *10
		for(int i=0; i<10 ; i++)
			System.out.println("Hello World");

//		예제.1부터 10까지 출력
		
		for(int i=1; i<=10 ; i++)
			System.out.println(i);
		/*
		 * int i=1; 변수선언
		 * 증가를 시키고 싶어 i++
		 * 조건을 붙여
		 */
	}

}
