package com.phwana.day01.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		/*
		 * 초 단위의 정수를 입력받고
		 * 몇시간, 몇분, 몇초인지 출력하는 프로그램
		 * 초단위의 정수 입력 :3000
		 * 0시간 50분 0초입니다.
		 * 초단위의 정수 입력 :3287
		 * 0시간 54분 47초입니다.
		 */
		
//		System.out.println(11+18);
//		System.out.println(11-18);
//		System.out.println(11*18);
//		System.out.println(11/18); //나누기 '몫'
//		System.out.println(11%18); //나누기 '나머지'값
		
		System.out.print("초 단위의 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
//		System.out.println(time/3600+"시간 "+time/60+"분 "+time%60+"초입니다.");
		
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60;  //큰수가 되면 이것 까지 해줘야 함
		int second = time % 60;
		System.out.println(hour+"시간 "+minute+"분 "+second+"초입니다.");
	}
}
