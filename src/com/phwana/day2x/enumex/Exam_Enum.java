package com.phwana.day2x.enumex;

//enum Week{
//	MONDAY,
//	TUESDAY,
//	WEDNESDAY,
//	THURSDAY,
//	FRIDAY,
//	SATURDAY,
//	SUNDAY
//}

enum Month{
	JANUARY,
	FEBRUARY,
	MARCH,
	APRIL
}

interface Days {
	int MONDAY = 1;
	int TUESDAY = 2;
	int WENESDAY = 3;
}

interface Months{
	int JANUARY = 1;
	int FEBRUARY = 2;
	int MARCH = 3;
}

public class Exam_Enum {
	/*
	 * 자바 미니 프로젝트
	 * 다이어리 - 월, 화, 수 .....
	 * 		  - 1월, 2월.......
	 */
	//1. 상수값을 int로 정의하기
	private static final int MONDAY = 1;
	private static final int TUESDAY = 2;
	private static final int WENDESDAY = 3;
	
	private static final int JANUARY = 1;
	private static final int FEBRARY = 2;
	private static final int MARCH = 3;

	public static void main(String[] args) {
		int num = Days.MONDAY;
		num = Months.JANUARY;
		//모든 상수를 배열로 반환: values() 리턴타입 확인
		for(Week week: Week.values()) {
			System.out.println(week+", ");
		}
		System.out.println();
		//문자열로 열거 상수 검색
		
		Week week = Week.valueOf("TUESDAY");
		System.out.println(week);
		//상수의 인덱스(순서)를 반환
		System.out.println(Week.WEDNESDAY.ordinal());
		
		Week today  = Week.SUNDAY;
		System.out.println(today + " is a "+ getIsWeekEnd(today));
	}
	private static String getIsWeekEnd(Week week) {
		return week.isWeekEnd() ? "WeekEnd" : "WeekDay";
	}
}
