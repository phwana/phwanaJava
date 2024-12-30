package com.phwana.day2x.enumex;

public enum Season {
	SPRING("봄"), SUMMER("여름"), AUTUMN("가을"), WINTER("겨울");
	//세미콜론
	// 생성자가 있음으로서 (if문 쓰지 않고도)내가 원하는 값을 초기화 가능
	
	//열거형 상수에 대응하는 문자열 값을 저장할 변수
	//ex) 봄, 여름, 가을, 겨울...
	private String season;
	
	// 생성자
	// 상수(한글)
	private Season(String season) {
		this.season = season;
	}
	
	public String getSeason() {
		return season;
	}

}
