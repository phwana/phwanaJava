package com.phwana.day04.typetrans.exercise;

import java.util.Scanner;
	
public class Exercise_TypeTrans{
		public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("값: ");
		
		int num = sc.nextInt();
		int sum = 0;
		double avg = 0;
		int count = 0;
		while(num != -1){
			sum += num;
			System.out.print("값 : ");
			num = sc.nextInt();
			count++;
		}
		System.out.println("합 : "+sum);
		avg = (double)sum / count;
		System.out.println("평균 : "+avg);
			
		}
	}
