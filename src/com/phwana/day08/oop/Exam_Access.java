package com.phwana.day08.oop;

/*
 * 접근지정자(제한자)
 * 종류: public, protected, default, private
 */

class Sample{
	public int everyone;
	private int onlyme;
	int onlyus;
}

public class Exam_Access {
	public static void main(String[] args) {
		Sample smp = new Sample();
		smp.everyone = 1118;
//		smp.onlyme = 0;
		smp.onlyus = 502; // 같은 패키지 내라서 가능하다!
		
	}

}
