package com.phwana.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Writerwrite {
	public static void main(String[] args) {
		try {
			Writer fw = new FileWriter("src/com/phwana/day15/stream/writer/writing.txt");
			char [] cArrs = "프론트엔드/백엔드".toCharArray();
			for(char cOne : cArrs) {
				fw.write(cOne);
			}
//			fw.write(cArr[0]);
//			fw.write(cArr[1]);
//			fw.write(cArr[2]);
			fw.flush();
			fw.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
