package com.phwana.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operater3 {
	public static void main(String [] args) {
		/*
		 * 입력받은 문자가 대문자인지 확인하는 프로그램
		 * 
		 * 문자 하나 입력: a
		 * 영어 대문자 확인: false
		 * 
		 * 문자 하나 입력: A
		 * 영어 대문자 확인: true
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char word = sc.next().charAt(0);
		boolean result = (65 <= word && word <= 90);
		System.out.println("영어 대문자 확인: "+result);
		/*
		 * 아스키코드표에서 대문자의 범위 확인
		 * 대문자 A가 저장되는 십진수와 대문자 Z가 저장되는 십진수
		 * 대문자 여부를 확인하는 것은 65와 90 사이의 값인지 체크하면 됨
		 */
	}

}
