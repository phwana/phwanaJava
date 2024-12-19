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
		/*
		 * 파일을 복사하려고 해
		 * C드라이브 및 Windows 폴더 밑에 system.ini파일을 복사하려고 해
		 * main()메소드를 기준으로 생각했을 때 해당 파일을 읽어야 하기 때문에 
		 * 입력스트림을 사용해야 해
		 * 입력스트림을 상요해서 파일을 읽은 다음에
		 * 읽은 내용은 목적지 C:\\Temp\\system.txt 파일에 써야해
		 * main()메소드를 기준으로 생각했을 때 해당 내용을 내보내야 하기 때문에
		 * 출력스트림을 사용해야 해
		 * 출력스트림을 사용해서 읽은 내용은 system.txt파일에 저장돼
		 * 출력스트림을 쓸때는 flush(), close()를 써줘야 해
		 * 둘중 하나만 해도 동작하지만 우리는 다 써야해?
		 */
		
		Reader reader = null;
		Writer writer = null;

		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
			
			int readCount;
			char [] cBuf = new char[1024];
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				writer.write(cBuf, 0, readCount);
				writer.flush();//close? 둘중 하나만써도 writer는 잘 작동
		}

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
