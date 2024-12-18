package com.phwana.day16.stream.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/phwana/day16/stream/io/writing.txt");
			//저장하고 싶은게 있으면 byte배열로
			Writer fw = new FileWriter("src/com/phwana/day16/stream/io/writing2.txt");
			
			byte[] byteArrs = "헬로우 입출력".getBytes();//파일이 나가서 쓰니까 출력
			os.write(byteArrs);
			os.flush();//버퍼비우기
			os.close();//자원 해제
			System.out.println("파일 쓰기 완료");
			
			fw.write("문자열 그대로 입력, 배열 변환 필요없음.");
			fw.flush();
			fw.close();
			System.out.println("패키지 클릭 후 F5를 눌러 확인해보세요");
			
			//후손이 먼저 쓰여야 함 (캐치절의 순서는 상속관계 따라 작성)
		} catch (FileNotFoundException e) {//Exception이 최상위클래스라 이거하나로 퉁칠수도
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
