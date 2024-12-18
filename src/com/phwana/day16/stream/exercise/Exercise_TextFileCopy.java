package com.phwana.day16.stream.exercise;

//하나로 퉁침
import java.io.*;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.Reader;
//import java.io.Writer;

public class Exercise_TextFileCopy {
	/*
	 * C:\\Windows\\system.ini을 복사해서
	 * C:\\Temp\\system.txt로 만들어주세요
	 * 단, 문자기반 스트림을 사용하세요
	 */
	
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader("");
			writer = new FileWriter("");
			
			System.out.println("복사가 완료되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//close
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
