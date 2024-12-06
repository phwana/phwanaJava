package com.phwana.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 o,x
	 * 매개변수 o,x
	 */
	public void noReturnNoparam() {
		System.out.println("noReturnNoParam");
//		return; (void에는 안써도 포함되어 있음)
	}
	public void noReturnYesParam(int num) {		//매개변수
//		int num; (이미 선언되어 있어 할 필요 없음)		//지역변수
		System.out.println("num : "+num);
//		return;
	}
	
	public int yesReturnNoParam() {
		int date = 20241118; //변수 없으면 return 20241118;
		return date;//int에 해당하는 값 써줘야 함
	}
	public int yesReturnYesParam(int num) {
		num += 10;
		return num;
	}
	
	public int sum(int ... numbers) {
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		return sum;
		}
	}


