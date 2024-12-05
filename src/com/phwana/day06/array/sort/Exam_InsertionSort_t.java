package com.phwana.day06.array.sort;

public class Exam_InsertionSort_t {
	public static void main(String [] args) {
		/*
		 * 삽입정렬
		 */
		int arrs [] = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}
			}
		}
		for(int num: arrs) {
			System.out.print(num + " ");
		}
//		for(int j = 1; j > 0; j--) {
//			if(arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
//		for(int j = 2; j > 0; j--) {
//			if(arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
//		for(int j = 3; j > 0; j--) {
//			if(arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
//		for(int j = 4; j > 0; j--) {
//			if(arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
		
		// #1
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		// #2
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		// #3
		if(arrs[2] > arrs[3]) {
			int temp = arrs[3];
			arrs[3] = arrs[2];
			arrs[2] = temp;
		}
		if(arrs[1] > arrs[2]) {
			int temp = arrs[2];
			arrs[2] = arrs[1];
			arrs[1] = temp;
		}
		if(arrs[0] > arrs[1]) {
			int temp = arrs[1];
			arrs[1] = arrs[0];
			arrs[0] = temp;
		}
		// #4
		if(arrs[3] > arrs[4]) {
			int temp = arrs[4];
			arrs[4] = arrs[3];
			arrs[3] = temp;
		}
		if(arrs[2] > arrs[3]) {
			int temp = arrs[3];
			arrs[3] = arrs[2];
			arrs[2] = temp;
		}
		if(arrs[1] > arrs[2]) {
			int temp = arrs[2];
			arrs[2] = arrs[1];
			arrs[1] = temp;
		}
		if(arrs[0] > arrs[1]) {
			int temp = arrs[1];
			arrs[1] = arrs[0];
			arrs[0] = temp;
		}
	}
}





















