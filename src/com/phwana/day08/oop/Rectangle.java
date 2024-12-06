package com.phwana.day08.oop;
/*
 * 너비와 높이를 입력 받아
 * 사각형의 합을 출력하는 프로그램
 * width, height 필드, 그리고 getArea()면적 값을 제공하는
 * 메소드를 가진 Rectangle 클래스를 만들어 활용
 * 
 *  >> 4 5 
 *  사각형 면적은 20
 */

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 : "+rect.getArea());
	}
}
