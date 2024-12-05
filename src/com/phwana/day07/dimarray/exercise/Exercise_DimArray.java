package com.phwana.day07.dimarray.exercise;
//기능용 클래스: 잠깐 저장공간이라 main~필요 없음
public class Exercise_DimArray {
	public void practice1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		
		int [][] dimNums = new int[5][5];
		
		int k=1;
		for(int i=0; i<dimNums.length; i++) {
			for(int j= 4; j>=0; j--) {
				dimNums[i][j] = k;
				k++;//1~25까지 증가: 값 변하지 않아!! 차곡차곡 출력이 기본값
			}
			//		dimNums[0][4] =1;
			//		dimNums[0][3] =2;
			//		dimNums[0][2] =3;
			//		dimNums[0][1] =4;
			//		dimNums[0][0] =5;
			
			//		dimNums[1][4] =6;
			//		dimNums[1][3] =7;
			//		dimNums[1][2] =8;
			//		dimNums[1][1] =9;
			//		dimNums[1][0] =10;
		}
		for(int i=0; i<dimNums.length; i++) {
			for(int j=0; j<dimNums[i].length; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21	
		
		int [][]dimNums = new int[5][5];
		
		int k=1;
		for(int j= 0; j<dimNums.length; j++)  {
			for(int i=4; i>=0; i--){
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
		
//		dimNums[4][0] =1;
//		dimNums[3][0] =2;
//		dimNums[2][0] =3;
//		dimNums[1][0] =4;
//		dimNums[0][0] =5;
		
//		dimNums[4][1] =6;
//		dimNums[3][1] =7;
//		dimNums[2][1] =8;
//		dimNums[1][1] =9;
//		dimNums[0][1] =10;
		
//		dimNums[4][2] =11;
//		dimNums[3][2] =12;
//		dimNums[2][2] =13;
//		dimNums[1][2] =14;
//		dimNums[0][2] =15;
		
//		dimNums[0][3] =20;
//		dimNums[0][4] =25;
		
//		dimNums[1][3] =19;
//		dimNums[1][4] =24;
		
//		dimNums[2][3] =18;
//		dimNums[2][4] =23;
		
//		dimNums[3][3] =17;
//		dimNums[3][4] =22;
		
//		dimNums[4][3] =16;
//		dimNums[4][4] =21;
	}
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		
		int [][]dimNums = new int[5][5];
		
		int k=1;
		for(int j= 0; j<dimNums.length; j++)  {
			for(int i=0; i<dimNums.length; i++){
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
//		dimNums[1][0] =2;
//		dimNums[2][0] =3;
//		dimNums[3][0] =4;
//		dimNums[4][0] =5;

//		dimNums[0][1] =6;
//		dimNums[1][1] =7;
//		dimNums[2][1] =8;
//		dimNums[3][1] =9;
//		dimNums[4][1] =10;
		
//		dimNums[0][2] =11;
//		dimNums[1][2] =12;
//		dimNums[2][2] =13;
//		dimNums[3][2] =14;
//		dimNums[4][2] =15;

//		dimNums[0][3] =16;
//		dimNums[0][4] =21;
		
//		dimNums[1][3] =17;
//		dimNums[1][4] =22;
		
//		dimNums[2][3] =18;
//		dimNums[2][4] =23;
		
//		dimNums[3][3] =19;
//		dimNums[3][4] =24;
		
//		dimNums[4][3] =20;
//		dimNums[4][4] =25;

		}
	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int [][] dimNums = new int[5][5];
		
		int k=1;
		
		for(int i=0; i<dimNums.length; i++) {
			if(i%2==0) { //짝수일때
				for(int j= 0;j<dimNums[i].length; j++) { //증가
					dimNums[i][j] = k;
					k++;
				}
			} else //홀수일때
				for(int j= 4; j>=0 ; j--) {  //감소
					dimNums[i][j] = k;
					k++;
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

//		dimNums[1][4] =6;
//		dimNums[1][3] =7;
//		dimNums[1][2] =8;
//		dimNums[1][1] =9;
//		dimNums[1][0] =10;
		
//		dimNums[2][0] =11;
//		dimNums[2][1] =12;
//		dimNums[2][2] =13;
//		dimNums[2][3] =14;
//		dimNums[2][4] =15;
		
//		dimNums[3][4] =16;
//		dimNums[3][3] =17;
//		dimNums[3][2] =18;
//		dimNums[3][1] =19;
//		dimNums[3][0] =20;
		
//		dimNums[4][0] =21;
//		dimNums[4][1] =22;
//		dimNums[4][2] =23;
//		dimNums[4][3] =24;
//		dimNums[4][4] =25;

	}

}
