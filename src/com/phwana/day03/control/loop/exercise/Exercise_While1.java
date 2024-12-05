package com.phwana.day03.control.loop.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		/*
		 * 문제1-1
		 * While문을 이용하여 1~10까지의 수를 더한 값 출력
		 * 
		 * 문제1-2
		 * While문을 이용하여 1~100사이의 홀수의 합 출력
		 */
		
		int sum=0;
		int i=1;

//		문제1-1
//		while(i<=10) {
//			sum += i; //sum=sum+i;
//			if(i != 10)
//				System.out.print(i+"+");
//			else
//				System.out.print(i+"=");
//			i++;
//			}
//		System.out.println(sum); 
		
//		문제1-2
		while(i<100) {
			sum+= i;
			if(i != 99)
				System.out.println(i+"+");
			else
				System.out.println(i+"=");				
			}
			i++;			
		}
		System.out.println(sum);
		}