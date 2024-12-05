package com.phwana.day06.array.sort;

public class Exam_SelectionSort {
	/*
	 * 선택정렬이란?
	 * 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
	 * 데이터의 양이 적을 때 좋은 성능을 보여준느 정렬,
	 * 데이터의 양이 많을 때 급격한 성능저하를 보임.
	 */
	public static void main(String []args) {
		int [] arrs = {2, 5, 4, 1, 3};
		//내림차순54321
		for(int i = 0; i<arrs.length; i++) { 			//반복
			int min = i;
			for(int j = i+1; j < arrs.length; j++) {	//최소값 탐색
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
			
			for(int num: arrs) {
				System.out.print(num + " ");
			}
//			if(arrs[0] > arrs[1]) {
//				//인덱스값을 기억하는 코드 min
//				min = 1;
//		}
//		if(arrs[0] > arrs[2]) {
//			min = 2;
//		}
//		if(arrs[0] > arrs[3]) {
//			min = 3;
//		}
//		if(arrs[0] > arrs[4]) {
//			min = 4;
//		}
	}
}
