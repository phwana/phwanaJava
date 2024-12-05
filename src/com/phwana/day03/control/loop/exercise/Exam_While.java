package com.phwana.day03.control.loop.exercise;

public class Exam_While {
	public static void main(String[] args) {
//		main+ctrl+스페이스바
		/*
		 * 제어문 - 반복문
		 * 2. While
		 * 문법
		 * 초기식;
		 * while(조건식) { 실행문장; 증감식;}
		 * 
		 * for(초기식; 조건식; 증감식) {실행문장;}
		 */
		// for문으로 1부터 10까지 출력해보세요
		
		for(int i=1; i<=10 ; i++) {
			System.out.println(i);
		}
		
		int i=1;
		while(i<=10) {
			System.out.println(i); 
			i++;
			}
	}
}
