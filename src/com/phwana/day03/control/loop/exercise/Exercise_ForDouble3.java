package com.phwana.day03.control.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int dan =2; dan<10; dan++) {
				if(dan==9) {
					System.out.println(dan+" * "+i+" = "+dan*i);
				}else {
				System.out.print(dan+" * "+i+" = "+dan*i);
				System.out.print("\t");
			}			
		}
	}
}
}