package com.phwana.day07.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
//		int num = 0;
//		int [] nums = new int[10]; //쓰지 않으면 노란줄
		int [][] dimNums = new int[5][5];
		System.out.println("행의 길이 : "+dimNums.length);
		System.out.println("열의 길이 : "+dimNums[0].length); 
		//첫번째 열의 길이이나 정방형이라 그냥 열의 길이라 말할 수 있다 
		/*
		 * 1   2 3 4 5 
		 * 6   7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 */
		
		int k=1;
		for(int i=0; i<dimNums.length; i++) {
			for(int j= 0; j<dimNums[i].length; j++) {
				dimNums[i][j] = k;
				k++;//1~25까지 증가
			}
		}
		for(int i=0; i<dimNums.length ;i++) {
			for(int j=0; j<dimNums[i].length;j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			} //%2d 두번째자리까지
			System.out.println();
		}
		
		
	//		dimNums[0][0] =1;
	//		dimNums[0][1] =2;
	//		dimNums[0][2] =3;
	//		dimNums[0][3] =4;
	//		dimNums[0][4] =5;
			
	//		for(int j=0; j<5; j++) {
	//			dimNums[1][j]=j+5;
	//		}
			
}
}
