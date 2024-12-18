package com.phwana.day16.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

//오늘은, 눈이, 옵니다, 펑펑, 옵니다.
public class Exercise_MemoPad {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저장할 파일명 입력(확장자 제외) : ");
		String fileName = sc.next();
		String destination="src/com/phwana/day16/stream/exercise/"+fileName+".txt";
		//변수처리를 위해 "+변수+"처리!!
		
		try {
			Writer wr = new FileWriter(destination);
			System.out.println("종료는 exit");
			for(int i=1;;i++) {
				System.out.print(i+" : ");
				String input = sc.next();
				if("".equals(input)) break;
				wr.write(input+"\n");
			}
				
//			wr.write("1 : 오늘은\n");
//			wr.write("2 : 눈이\n");
//			wr.write("3 : 옵니다\n");
//			wr.write("4 : 펑펑\n");
//			wr.write("5 : 옵니다.\n");
			wr.flush();//Unreachable code
			wr.close();
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


}
