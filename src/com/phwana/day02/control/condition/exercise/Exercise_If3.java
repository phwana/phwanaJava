package com.phwana.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String [] args) {

		/*
		 * 문제3
		 * 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요.
		 * 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		 * 점수를 입력해주세요 : 92
		 * 학점은 A입니다.
		 * 
		 * 점수를 입력해주세요 : 102
		 * 0 ~ 100 사이의 수를 입력해주세요
		 * 커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F )
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요(0~100): ");
		int score = sc.nextInt();
		char grade;
		
		if(score < 0 || score > 100) {
			System.out.println("0~100 사이의 수를 입력해주세요.");
			return; //동작 안하게 하는 법1
		}
		//여기 패러그래프를 return에 넣어도 됨!
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) { //하한선만 끊어줘도 됨(score<90 뺌)
			grade ='B';
		}else if(score>=70) {
			grade ='C';
		}else if(score>=60) {
			grade ='D';
		}else {
			grade='F';					
		}
		//동작 안하게 하는 법2
		if(grade != 0) {
		System.out.println("학점은 "+grade+"입니다.");
	}
	}}

