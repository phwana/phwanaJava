package com.phwana.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("메뉴를 입력해주세요: ");
		String menu = sc.next();
		
		int price = 0; //모델 방식
		switch(menu){
			case "에스프레소": 
				price=2500; 
				break;
			case "아메리카노": 
				price=3000; 
				break;
			case "카페라떼": 
				price=3500; 
				break;
			case "카푸치노": 
				price=4000; 
				break;
			default: System.out.println("없는 메뉴입니다.");
			//return;
		}
	if(price != 0){
		System.out.println(price + "원입니다.");
	}
	}
}
