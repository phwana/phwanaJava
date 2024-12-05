package com.phwana.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String[] args) {
		int [] arrs = {1, 3, 2};
		for(int val: arrs)
			System.out.println(val);
		
		System.out.println("exchanged!");
		int temp = arrs[1];
		arrs[1] = arrs[2];
		arrs[2] = temp;
		
		for(int num: arrs)
			System.out.print(num+" ");
		
		
	}

}
