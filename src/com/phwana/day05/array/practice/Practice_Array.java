package com.phwana.day05.array.practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1~10까지 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs;
		arrs = new int[10];
		
		for(int i=0; i<10; i++) { //저장
			arrs[i] = (i+1);
		}
		for(int i = 0;i<10; i++) { //출력
			System.out.print(arrs[i]+" ");
		}
	}
	public void practice2() {
		int [] arrs;
		arrs = new int[10];
		
		for(int i=0, count=10 ; i<10; i++, count--) {
			arrs[i] = count;
		}
		for(int i=0; i<10; i++) {
		System.out.print(arrs[i]+" ");
	}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int input = sc.nextInt(); 
		int [] nums = new int[input];
		//배열에 데이터 저장(1~input까지)
		
		for(int i=0; i<input; i++) { 
			nums[i] = (i+1) ;
			System.out.print(nums[i]+" ");
			}
		}
		
	public void practice4() {
		String [] fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		System.out.println(fruits[1]);
		
		for(int i = 0; i < fruits.length; i++);
			System.out.print(fruits[1]+" ");
	}
	public void practice5() {
		/*
		 * 문자열 입력 받아
		 * 문자 하나하나를 배열에 넣고 검색할 문자가
		 * 문자열에 몇 개 들어가 있는지 갯수와
		 * 몇 번째 인덱스에 위치하는지
		 * 인덱스 출력	
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력: ");
		String input = sc.next(); 
		char [] alpha = new int[input];
		
		System.out.println("문자열: "+);
		System.out.println("문자: "+);
		System.out.println("app에 i가 존재하는 위치(index): "+);
		System.out.println("i 개수: "+);
	}
	public void practice6() {
		/*
		 * 월~일까지 초기화된 문자열 배열을 만들고
		 * 0~6까지 숫자를 입력받아 
		 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		 * 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요
		 */
		String [] days = new String [7];
		days[0] = "월";
		days[1] = "화";
		days[2] = "수";
		days[3] = "목";
		days[4] = "금";
		days[5] = "토";
		days[6] = "일";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력: ");
		int num = sc.nextInt();
			if(0>num || 6<num)
				System.out.println("잘못 입력하셨습니다");
			else {
				System.out.println(days[num]+"요일");
			}
	}
	public void practice7() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여
		 * 그 값만큼 정수형 배열을 선언 및 할당하고
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		int sum = 0;
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<nums.length ;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			input = sc.nextInt();
			nums[i] = input;
			sum += nums[i];
		}
//		전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		for(int num: nums)
			System.out.println(num +" ");
		System.out.println();
		System.out.println("총 합 : "+sum);
		
			}
	public void practice8() {
		System.out.println("practice8");
	}
	public void practice9() {
		System.out.println("practice9");
	}
	public void practice10() { //중복도 빼야함 
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		char [] alpha = sc.next();
		
		System.out.print(alpha+", ");
		System.out.println(i);
	}

	public void practice11() {
		/*
		 * 로또
		 */
		int[]lottos = new int[6];
		Random rand = new Random();
		for(int i =0; i<lottos.length; i++) { //i는 고정값
			//1~45사이의 숫자가 랜덤하게 나와야 
//			System.out.print((rand.nextInt(45)+1)+" "); 변수넣어야 같은 값으로 나옴
			//배열 안에 넣어보기
			lottos[i] = rand.nextInt(45)+1;
			
			for(int j=0; j<i ;j++) {
				if(lottos[j+1]==lottos[j]) {
				i--;//i++를 만나기 때문에 i--가 필요하다
				} //정지하려면 break; 넣으면 된다?
			}
		}
		//선택, 삽입, 버블,...
		for(int j=0; j<(lottos.length-1); j++){
			for(int i = 0; i<(lottos.length-1)-j; i++){
				if(lottos[i]>lottos[i+1]) {
					int temps = lottos[i];
					lottos[i] = lottos[i+1];
					lottos[i+1] = temps;
				}
			}
		}
		
		
		for(int lotto: lottos) {
			System.out.print(lotto+" ");
		}
		System.out.println();
	}
	public void practice12() {
		System.out.println("practice12");
	}
}




















