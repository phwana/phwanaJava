package com.phwana.day08.oop;

import java.util.Random;

class StaticSample {
	public int num;
	public void normalMethod() {}
	
	public static int input; //static은 이탤릭체로 표현
	public static void staticMethod() {}
}

public class Exam_Static {
	public static void main(String[] args) {//매개변수는 배열로 받는다?
		StaticSample sample = new StaticSample();
		sample.num = 11;
		sample.normalMethod();
		
		StaticSample.input=10;
		StaticSample.staticMethod(); //rand.nextInt(10);와 유사!!
		
		
		Random rand = new Random();
		rand.nextInt(10);
		
		int num =(int)Math.random()*10+1;//Math는 util성을 사용할때 쓴다
	}

}
