package com.phwana.day15.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


//입력스트림이란 통로를 여는 것(포터를 여는 것)
public class Exam_InputStreamRead {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;
			
			//세가지 중 편한거 쓰면 되는데 다 알고 있어야 함!!(do)while/for
			//#1
			while((readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
			
			//#2
			do {
				readByte = is.read();//읽어들이고
				System.out.print((char)readByte);//출력을 한 다음에
			}while(readByte != -1);
			//#3
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
			//#4
			for(;;) {//언제까지? 다 읽을때까지 -> 다 읽은건 어떻게 알지? -> is.read() == -1
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println();
			
			is.close();
//			is.read();
			//File을 지워 import하면 upcasting이 가능하다
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
