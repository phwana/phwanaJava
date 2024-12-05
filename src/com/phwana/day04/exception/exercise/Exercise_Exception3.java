package com.phwana.day04.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception3 {
	public static void main(String [] args) {
		/*
		 * 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		 * 사용자가 정수가 아닌 문자를 입력할 때 발생하는 
		 * InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		 * 정수 3개를 입력하세요.
		 * 11 2 3
		 * 합은 16
		 * 
		 * 정수 3개를 입력하세요
		 * 11 a
		 * 정수를 입력해주세요
		 * 2 3
		 * 합은 16
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0; //누적합을 위한 변수 sum
		for(int i = 0; i < 3; i++) { //0~2까지 1씩 증가
			try {
				int num = sc.nextInt();
				sum += num;
				
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				sc.next();
				i--; //로또
			}			
				}
			System.out.println("결과 : "+sum);
		}
	}