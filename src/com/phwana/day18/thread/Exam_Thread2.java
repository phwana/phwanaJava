package com.phwana.day18.thread;
//카운트업 쓰레드가 됨
class CountUp extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
//카운트다운 쓰레드가 됨
class CountDown extends Thread{

	@Override
	public void run() {
		for(int i = 69; i>=65; i--) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}	
}

public class Exam_Thread2 {//동시에 하고 싶으면 둘다 쓰레드로 만들어
	public static void main(String[] args) {//main은 순서대로 실행됨
	}	
}

