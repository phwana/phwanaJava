package com.phwana.day08.oop;

public class Circle {
		//멤버변수
	final double PI = 3.14;
	double radius;
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	//메소드 (따로 나누지 않고 함께 써도 상관 없다)
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10; //값을 넣어준다. 근데 어디 있는 것인가?
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		donut.radius = 2;
		System.out.println(donut.getArea());
	}
}
