package com.phwana.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exercise_CodeRead {
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader("src/com/phwana/day15/stream/Exam_InputStreamReadByteOff.java");
			int readCount;
			char [] cBuf = new char[1024];
			String result = "";
			while(true) {
				readCount = fr.read(cBuf);
				if(readCount ==-1) break;
				result += new String(cBuf, 0, readCount);
			}
			System.out.println(result);
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
