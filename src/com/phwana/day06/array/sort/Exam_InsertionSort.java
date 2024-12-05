package com.phwana.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		/*
		 * 삽입정렬
		 */
		int arrs [] = {2, 5, 4, 1, 3};
	for(int i=1 ; i < arrs.length ; i--) {		// 두번째를 기준으로
		for(int j= i ; j > 0 ;j++) {
			if(arrs[j-1] > arrs[j]) {			// 앞에 있는 것들을 비교
			int temp = arrs[i+1];
			arrs[i+1] = arrs[i];
			arrs[i] = temp;
			}
		}
	}
	for(int num: arrs) {
		System.out.print(num+" ");
	}
	}
}