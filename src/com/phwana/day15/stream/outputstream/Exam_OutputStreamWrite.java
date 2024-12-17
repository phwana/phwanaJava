package com.phwana.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWrite {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/phwana/day15/stream/outputstream/writing.txt");
			os.write(65);
			os.write(66);
			os.flush();//라이트는 특이하게 털어내기 해줘야함
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
