package com.phwana.day04.typetrans;

public class Exam_TypeTrans {
	public static void main(String [] args) {
		/*
		 * 형변환
		 * 컴퓨터에서 연산은 원칙적으로 같은 자료형끼리 계산하여
		 * 해당 자료형으로 결과가 나옴
		 * 
		 * 정수/정수=정수, 정수*정수=정수
		 * ex) 36/5=7
		 * 정수와 정수의 계산에서 실수가 나오게 하려면
		 * 강제 형변환과 자동 형변환을 사용
		 * (double)36/5=7.2
		 * 강제 형변환: 데이터 손실이 있을 수 있음
		 * 자동 형변환: 자료형이 더 큰 쪽으로 변환
		 * (정수 -> 실수)
		 * 
		 */
		
		byte bNum = 127;
		int iNum =10;
		double dNum = 3.14;
		// 자동 형변환의 예
		// - iNum이 정수에서 실수로 형변환
		double result = dNum * iNum;
		System.out.println(result);
		
		// 강제 형변환의 예
		// 1. 큰 자료형을 작은 자료형으로 변환 (int)
		System.out.println("dNum : "+(int)dNum);
		// 2. 작은 자료형을 큰 자료형으로 변환
		// - 평균 구할 때 사용
		result = (double)iNum / iNum;
		System.out.println("result : "+result);
		// 3. 문자로 형변환(강제 형변환 예2)
		System.out.println((char)65);
		
		// Mini Quiz
		// (int)2.9+1.8 -> 3.8
		// (int)(2.9+1.8) -> ? 4
		// (int)2.9 + (int)1.8 -> 3
		
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
