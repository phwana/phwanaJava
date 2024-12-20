package com.phwana.day18.thread;

class CountUpRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}	
	}	
}
class CountDownRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 69; i>=65; i--) {
			System.out.println(Thread.currentThread().getName()+" : "+(char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	
	}
}


public class Exam_ThreadRunnable {
	public static void main(String[] args) {
		//Thread객체를 만들어야 함
		Thread thread1 = new Thread(new CountUpRunnable(), "카운트업 쓰레드");
		Thread thread2 = new Thread(new CountDownRunnable(), "카운트다운 쓰레드");
		thread1.start();
		thread2.start();
	}
}


