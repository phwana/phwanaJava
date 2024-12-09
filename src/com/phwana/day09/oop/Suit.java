package com.phwana.day09.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) 호출!!");
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) 호출");
	}
	public Suit(int size, String brand, int price) {//생성자만 주구장창 만들고 있는거임
		this.size=size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String,int)호출");
	}
	public static void main(String[]args) {
		Suit s = new Suit(100);
	}
}
