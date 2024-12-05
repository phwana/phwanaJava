package com.phwana.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 
		 * -1이 입력되면 입력한 수의 합을 출력하시오.
		 * 
		 * 값 : 1
		 * 값 : 2
		 * 값 : -1      ->합하라는 뜻임
		 * 합 : 3
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		int num = sc.nextInt();
		
		int sum=0;
		while(num != -1) {
			sum += num;
			System.out.print("값 : ");
			num=sc.nextInt();			
		}
		System.out.println("합: "+sum);
	}

}
