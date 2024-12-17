package com.phwana.day15.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamReadByte {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;					//readByte가 읽은 갯수
			byte [] readBytes = new byte[3];//세글자씩 읽는다->1024:1KB씩 읽게 함
			String result = "";
			while((readByte = is.read(readBytes)) != -1) {
				//readByte는 읽은 값이 출력되는 것이 아니라 읽은 갯수를 출력
//				System.out.println((char)readByte);	
				/*
				 * readBytes는 읽은 값을 가지고 있음
				 * 나는 문자열로 출력을 해야 함
				 * 바이트배열 -> 스트링으로 변환되어야 함
				 * "1"-> 1, Integer.parseInt("1");
				 */
				result += new String (readBytes, 0, readByte);
				//반복되고 누적되어야 함->누적합!
			}
			System.out.println(result);
			is.close();//닫아야 함
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
