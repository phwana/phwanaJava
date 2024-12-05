package com.phwana.day04.exception.exercise;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		/*
		 * 두개의 정수를 입력받아 나눈 후
		 * 그 결과를 출력하는 프로그램을 작성하여라
		 * - 문자를 입력 받으면 다시 입력할 수 있게
		 * 1.try~catch 2.무한반복 3. 알맞은 예외 및 메시지 및 코드 작성
		 */
				Scanner sc = new Scanner(System.in);
			while(true) {
				int result = 0;
				try {
					System.out.print("첫번째 정수 입력 : ");
					int num1 = sc.nextInt();
					System.out.print("두번째 정수 입력 : ");
					int num2 = sc.nextInt();
					result = num1 / num2;
					
				//멀티 catch 절이 가능
				} catch (ArithmeticException e) {
					//e.printStackTrace();
					System.out.println("정수를 입력해주세요.");
					//continue; ->for문과 함께 써야함 !!
				} catch (InputMismatchException e) {
					//e.printStackTrace();
					System.out.println("숫자를 입력해주세요");
					sc.next(); //문자 제거용
				}
				System.out.println("결과 : " + result);
			}
		} 
}