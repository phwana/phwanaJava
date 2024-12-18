package com.phwana.day16.stream.exception;

public class Exam_Exception {
	/*
	 * 1. 예외처리란 무엇인가?
	 * 2. 예외의 종류는 무엇이 있는가
	 * 3. Un/Checked Exception의 차이는 무엇?
	 * 4. 예외의 최고 조상 클래스는 무엇인가? //여기까지 pdf에
	 * 5. 예외처리 방법
	 * - try~catch문 사용하여 발생한 곳에서 직접 처리
	 * - throws를 사용하여 예외 회피(처리x)
	 */
	public static void main(String[] args) {
//		try {
			int result = divNum(10, 0);
	}
	public static int divNum(int data1, int data2) {//result타입으로 바꿔줘야 함
		int result = 0;
		try {
			result = data1/ data2;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return result;
	}
}
