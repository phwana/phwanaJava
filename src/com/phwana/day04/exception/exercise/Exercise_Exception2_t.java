package com.phwana.day04.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2_t {
	/*
	 * 두 개의 정수를 입력받아 나눈 후 
	 * 그 결과를 출력하는 프로그램을 작성하여라.
	 */
	/*
	 * 1. try ~ catch
	 * 2. 무한반복
	 * 3. 알맞은 예외, 메시지 그리고 코드 작성
	 * 4. 테스트
	 */
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) { //무한 반복
			int result = 0;
			try {
				System.out.print("첫번째 정수 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				int num2 = sc.nextInt();
				result = num1 / num2;
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				sc.next(); //문자 제거용
				continue; //오류가 났을 때 반복
 			}
			System.out.println("결과 : " + result);
		}
	}
}
