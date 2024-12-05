package com.phwana.day03.control.loop.exercise;

public class Exercise_ForDouble {
	public static void main(String[] args) {
		/*
		 * 0시 0분부터 23시 59분까지 출력
		 * 0시 0분
		 * 0시 1분
		 * ...
		 * 1시 0분
		 * 1시 1분
		 * ...
		 * 23시 0분
		 * ~
		 * 23시 59분
		 */
				
		for(int h = 0 ; h < 24; h++) {
			for(int min = 0 ; min < 60; min++) {
				System.out.println(h+"시 "+min+"분");
			}
		}
	}
}
