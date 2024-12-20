package com.phwana.day18.thread;

public class Exam_Thread1 {
	public static void main(String[] args) {//main은 순서대로 실행됨
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);//전달값으로 밀리초를 받음, 
				//1ms=1/1000초, 1000ms는 몇초? 1초, 500ms는 0.5초(잠깐 멈추는 코드) 
			} catch (InterruptedException e) {//sleep은 checkedException이라서 try catch 해야함
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
			
			for(int i = 5; i>=0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
		}
	}
}
