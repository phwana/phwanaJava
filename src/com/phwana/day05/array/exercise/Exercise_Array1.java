package com.phwana.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String[] args) {
		/*
		 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		 * 입력받고 평균을 구하는 프로그램을 작성하라.
		 * 단, 배열의 크기는 5이다.	
		 */
		
		int nums [] = new int[5];
		System.out.println(nums.length); //배열의 크기length를 알아볼 수 있다
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		for(int i = 0; i < nums.length ; i++) {
			nums [i] = sc.nextInt();
			total += nums[i];
		}
		
//		int total = nums[0] + nums[1] + nums[2] + nums[3] + nums[4]; 누적합
		double avg = total/ (double)5;
		
		System.out.println("평균 : "+avg);

		}
	}	
