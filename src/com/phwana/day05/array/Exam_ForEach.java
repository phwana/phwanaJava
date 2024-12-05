package com.phwana.day05.array;

public class Exam_ForEach { //포히치라고 발음하심: 인덱스i 값 없으면 사용가능
	public static void main(String[] args) {
		int [] nums = {24, 12, 25, 1, 2};
//		for(int i = 0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		} 똑같
		for(int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println(); //개행
		
		int sum = 0;
		for(int num: nums)
			sum += num;
		System.out.println("합 : "+sum);
		
		String [] fruits = {"딸기", "체리", "자두", "사과", "포도", "용과"};
		for(String fruit: fruits) {
			System.out.print(fruit+" ");
		}
		System.out.println();
	}

}
