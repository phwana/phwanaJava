package com.phwana.day05.array.practice;

import java.util.Scanner;

public class Practice_Sort {
//	1. 구현
//	 주제 : 5개의 정수를 입력후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오 
//	 - 요구사항
//	     2) 입력은 반복문, Scanner 객체를 사용하여 5번 입력 받아야 함 (정수 5개 입력받는 배열 사용)
//	     3) 정렬 기법은 버블정렬을 이용하여 오름차순 정렬 되어야 함
//	     4) 정렬된 결과 출력은 반복문을 이용하여 출력 되어야 함
//	     5) 마지막에 첫번째 수와 마지막수를 합한 값을 출력할 수 있어야 함

	Scanner sc = new Scanner(System.in); 	//스캐너
	int nums [] = new int[5];				//배열
	
	for(int i=0; i<nums.length ; i++) {		//
		nums[i] = sc.nextInt();
		System.out.println(i+"번째 정수 입력 : ");
	}
	for(int j=0; j<arrs.length-1 ;j++) {
		for(int i=0; i<(nums.length-1)-j; i++){
			if(nums[i]>nums[i+1]) {
			int temp = nums[i+1];
			nums[i+1] = nums[i];
			nums[i] = temp;
			}
		}
	}
		for(int num: nums)
			System.out.println(num+" ");		//4
		System.out.println(nums[0]+nums[4]);
	
}
}
	
	
//	2. 실행 결과  
//
//	ex1)
//	1번째 정수 입력 : 7
//	2번째 정수 입력 : 4
//	3번째 정수 입력 : 8
//	4번째 정수 입력 : 5
//	5번째 정수 입력 : 1
//	정렬된 결과 : 1 4 5 7 8 
//	정렬 후 첫번째 수와 마지막수의 합 : 9
//
//	ex2)
//	1번째 정수 입력 : 5
//	2번째 정수 입력 : 4
//	3번째 정수 입력 : 3
//	4번째 정수 입력 : 2
//	5번째 정수 입력 : 1
//	정렬된 결과 : 1 2 3 4 5 
//	정렬 후 첫번째 수와 마지막수의 합 : 6


