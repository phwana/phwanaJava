package com.phwana.day04.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// 예외가 발생할 수 있기 때문에 예외처리를 강제함
		// -> Checked Exception
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//예외가 발생할 수 있으나 예외처리는 강제하지 않음
		// -> UnChecked Exception
		 try {
			int num = sc.nextInt();
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.println("숫자를 입력해주세요");
		}
	}

}
