package com.phwana.day06.array.sort;

public class Exam_BubbleSort {
	/*
	 * 버블정렬이란?
	 * 인접한 두개의 원소를 검사하여 정렬하는 방법
	 * 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할 때 가장 빠름.
	 * 기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로 정렬할 때 가장 느림.
	 */
	public static void main(String[] args) {
		int [] arrs = {2, 5, 4, 1, 3};
		//오름차순12345
		//비교횟수 감소
	for(int j=0; j<arrs.length-1 ;j++) {
		for(int i=0; i<(arrs.length-1)-j; i++){
			if(arrs[i]>arrs[i+1]) {
			int temp = arrs[i+1];
			arrs[i+1] = arrs[i];
			arrs[i] = temp;
			}
		}
	}
		for(int num: arrs)
			System.out.print(num+" ");
	}
}