package com.phwana.day09.objectarray;

import java.util.Scanner;

class Book{
	String name = "";
	String author = "";
	String price = "";
	String publisher = "";
	
//	public Book() 기본생성자->필드에 값을 넣어준다
//		name = "";
//		author = "";
//		price = "";
//		publisher = "";
//	} 생성자에서 초기화 하는게 기본?
	
	void printInformation() {
		System.out.println(name+"의 작가는"+author+"입니다. 출판사는 "+publisher+"이고, 가격은 "+price+"입니다.");
	}
}

public class BookArray {
	public static void main(String[] args) {
//1		Book book = new Book();
//		book.name = "자바의 신";
//		book.author = "김자바";
//		book.price = "25000";
//		book.publisher = "길벗이지톡";
//		book.printInformation();
		
		Scanner sc = new Scanner(System.in);
		Book[]books = new Book[5];
		for(int i=0; i<books.length ;i++) {
			books[i] = new Book();
			books[i].name = sc.next();
			books[i].author = "김자바";
			books[i].price = "25000";
			books[i].publisher = "길벗이지톡";
			books[i].printInformation(); //여기만 다른 값, 객체마다 다른 값 저장가능
			
		}
		
//2		books[1] = new Book();
//		books[1].name = "자바의 신";
//		books[1].author = "김자바";
//		books[1].price = "25000";
//		books[1].publisher = "길벗이지톡";
//		books[1].printInformation();
//		
//		books[2] = new Book();
//		books[2].name = "자바의 신";
//		books[2].author = "김자바";
//		books[2].price = "25000";
//		books[2].publisher = "길벗이지톡";
//		books[2].printInformation();
//		
//		books[3] = new Book();
//		books[3].name = "자바의 신";
//		books[3].author = "김자바";
//		books[3].price = "25000";
//		books[3].publisher = "길벗이지톡";
//		books[3].printInformation();
//		
//		books[4] = new Book();
//		books[4].name = "자바의 신";
//		books[4].author = "김자바";
//		books[4].price = "25000";
//		books[4].publisher = "길벗이지톡";
//		books[4].printInformation();
	}

}
