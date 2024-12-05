package com.phwana.day03.control.loop.exercise;

public class Exercise_For2 {
	public static void main(String []args) {
		/*
		 * 문제2-1
		 * 1부터 10까지의 덧셈을 구하는 프로그램
		 * 55
		 * 문제2-2
		 * 1부터 10까지 덧셈을 표시하고 합도 구하는 프로그램
		 * 1+2+...+10=55
		 */
		int sum = 0; //연산은 두개의 항이 필요하므로 sum을 선언하여 i와 더해줌
		for(int i=1 ; i<=10; i++) {
			
			/*
			 * sum = 1;
			 * sum = 1+2; -> sum = sum + 2;
			 * sum = 1+2+3; -> sum = sum + 3;
			 * ...
			 * sum = 1+2+...+10;
			 */
			sum = sum + i; //sum += i -> 누적합
			if(i != 10) System.out.print(i+"+");
			else System.out.print(i+"=");
		}
			System.out.println(sum);
	}
}
