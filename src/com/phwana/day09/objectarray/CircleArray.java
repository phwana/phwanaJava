package com.phwana.day09.objectarray;

class Circle{
	int radius;
	
	//기본생성자
	public Circle() {
		radius = 0;
	}
	//매개변수가 있는 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
		
	}
}

public class CircleArray {
	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.radius = 10;
		Circle circle = new Circle(10); //두줄을 한줄로 대체할 수 있다
		
		Circle[]circles = new Circle[5];
		circles[0] = new Circle(); 
		//★new를 한번더(화살표*2번!!)얘가 없으면 null(빈) 상태가 됨
		circles[0].radius = 10;
		System.out.println(circles[0].getArea());
		
	}

}
