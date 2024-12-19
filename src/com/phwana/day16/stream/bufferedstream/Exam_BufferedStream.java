package com.phwana.day16.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		Reader reader = null; //주스트링
		BufferedReader bReader = null; //보조스트링 함께 씀
		
		try {
			reader = new FileReader("src/com/phwana/day16/stream/exercise/Exercise_TextFileCopy.java");
			bReader = new BufferedReader(reader);//보조스트림 객체 생성시 주스트림을 전달해줘야 함
//			int readCount;
//			readCount = reader.read(null);
			String line;
			while((line = bReader.readLine()) != null)
			for(int i=0; i<10; i++)
			System.out.println(bReader.readLine()); 
			//bReader.readLine(): readLine이라는 한줄씩 읽는 메소드
			//bReader.readLine()->line으로 바꿔서 출력하면 더 완벽?
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
