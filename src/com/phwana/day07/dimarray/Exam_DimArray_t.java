package com.phwana.day07.dimarray;

public class Exam_DimArray_t {
	public static void main(String [] args) {
		int num = 0;
		int [] nums = new int[10];
		int [][] dimNums = new int[5][5];
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);
		// 1   2  3  4  5
		// 6   7  8  9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		int k = 1;
		for(int i = 0; i < dimNums.length; i++) {
			for(int j = 0; j < dimNums[i].length; j++) {
				dimNums[i][j] = k;
				k++; // 1 ~ 25까지 증가
			}
		}
		
		for(int i = 0; i < dimNums.length; i++) {
			for(int j = 0; j < dimNums[i].length; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
		
//		// #1번째 행
//		for(int j = 0; j < 5; j++) {
//			dimNums[0][j] = j+1;
//		}
////		dimNums[0][0] = 1;
////		dimNums[0][1] = 2;
////		dimNums[0][2] = 3;
////		dimNums[0][3] = 4;
////		dimNums[0][4] = 5;
//		// #2번째 행
//		for(int j = 0; j < 5; j++) {
//			dimNums[1][j] = j+5;
//		}
////		dimNums[1][0] = 6;
////		dimNums[1][1] = 7;
////		dimNums[1][2] = 8;
////		dimNums[1][3] = 9;
////		dimNums[1][4] = 10;
//		// #3번째 행
//		for(int j = 0; j < 5; j++) {
//			dimNums[2][j] = j+11;
//		}
////		dimNums[2][0] = 11;
////		dimNums[2][1] = 12;
////		dimNums[2][2] = 13;
////		dimNums[2][3] = 14;
////		dimNums[2][4] = 15;
//		// #4번째 행
//		for(int j = 0; j < 5; j++) {
//			dimNums[3][j] = j+16;
//		}
//		// #5번째 행
//		for(int j = 0; j < 5; j++) {
//			dimNums[4][j] = j+21;
//		}
	}
}












