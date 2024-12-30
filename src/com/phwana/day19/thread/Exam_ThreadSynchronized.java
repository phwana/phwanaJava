package com.phwana.day19.thread;

public class Exam_ThreadSynchronized {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new Thread(new StudentThread("", board));
		th1.setName("OhCoffee");
		Thread th2 = new Thread(new StudentThread("", board));
		th2.setName("MegaCoffee");
		th1.start();
		th2.start();
		
	}

}

class StudentThread implements Runnable {
	// 필드, 멤버변수
	private SharedBoard board;
	// 기본/생성자
	public StudentThread() {
		
	}
	//매개변수 있는 생성자
	public StudentThread(String name, SharedBoard board) {
		this.board = board;
		
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			board.add();
		}
		
	}
	
}

class SharedBoard {
	private int sum = 0; //집계판의 합
	synchronized public void add() { //싱크로나이즈 -> multi아닌 single thread 누적??
		int n = sum;
		Thread.yield(); //현재 실행 중인 스레드 양보
		n += 10;		//10증가
		sum = n;		//증가한 값을 집계함에 기록
		System.out.println(Thread.currentThread().getName()+" : "+sum);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getSum() {
		return sum;
	}
}
