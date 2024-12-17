package com.phwana.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Exam_CodeRead {
	/*
	 * Exam_InputStreamReadByteOff.java파일을 '읽어서' 콘솔에 출력 ->Reader
	 * 단, 문자기반 스트림 이용
	 */
	public static void main(String[] args) {
		try {
			Reader rd = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
