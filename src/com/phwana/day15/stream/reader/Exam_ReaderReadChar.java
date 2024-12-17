package com.phwana.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReaderReadChar {
	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("C:\\Window\\system.ini");
			int readCount;
			char[] cBuf = new char[3];
			String result = "";
			while((readCount = reader.read()) != -1) {
//				System.out.println((char)readCount);
				result += new String(cBuf, 0, readCount);
			}
			System.out.println(result);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
