package com.phwana.day16.stream.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Exam_Exception2_t {
	public static void main(String[] args) {
//		try {
//			Reader reader = new FileReader("C:\\Windows\\system.ini");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			readFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void readFile() throws FileNotFoundException {
		Reader reader = new FileReader("C:\\Windows\\system.ini");
//		try {
//			Reader reader = new FileReader("C:\\Windows\\system.ini");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
