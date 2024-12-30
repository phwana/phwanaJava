package com.phwana.day19.thread;

class PrintNumbers implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<6; i++) {
			System.out.println("숫자 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //밀리세크초를 전달값으로 받음, Checked Exception예외 강제
		}
		
	}
	
}

class DownloadFiles implements Runnable{

	@Override
	public void run() {
		String [] files = {"document.pdf", "image.jpg", "video.mp4"};
		for(String file: files) {
			System.out.println(file+"다운로드 중...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Exam_MultiThread {
	public static void main(String[] args) {
		
		Thread nThread = new Thread(new PrintNumbers());
		Thread dThread = new Thread(new DownloadFiles());

		nThread.start();
		dThread.start();
		//기존 싱글 스레드
//		printNumbers();
//		downloadFiles();
	}

	private static void downloadFiles() {
		
	}
	
	private static void printNumbers() {
		
	}
}
