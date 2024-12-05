package com.phwana.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	public static void main(String []args) {
		/*
		 * 2단 출력
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ...
		 */
		
		for(int i=1; i<10 ;i++)
		
		System.out.println("2 * "+i+" = "+ 2*i);
		
//		ctrl+Alt+방향키(아래)->문장 복붙 아래로
//		sysout+ctrl+스페이스바->System.out.println();

		/*
		 * 문제1
		 * 정수 하나를 입력받아서
		 * 그 수가 1~9사이의 수일 때만
		 * 그 수의 구구단을 출력하세요.
		 * 단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다"를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int dan = sc.nextInt();
		
		for(int i=1 ; i<10 ; i++)
		if(dan>=1 && dan<=9){
			System.out.println(dan+" * "+i+" = "+ dan*i);
			return;  //대신????????????????????
		}else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
	/*
	 * if(dan<1 || dan>9){             //or연산자 이용하여 조건 해당치 않으면 메시지 출력
	 * system.out.println("1~9사이의 양수를 입력하여야 합니다.");
	 * }else {
	 * 		for(int i=1; i<10 ; i++){
	 * 			System.out.println(dan+" * "+i+" = "+dan*i);
	 * }
	 */
	}

}
