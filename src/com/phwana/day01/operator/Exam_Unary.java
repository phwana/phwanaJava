package com.phwana.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		/*
		 * 단항 연산자
		 * a++, ++a -> a = a + 1;
		 */
		int num = 1;
		System.out.println(++num);	//전이연산: num은 2
		System.out.println(num++);	//후이연산: (먼저 출력부터 하고)+1연산을 나중에 함: num은 여전히 2가 됨
		System.out.println(num);	//여기서 계산: num은 3이 됨
		
		/*	++num, num++, num -> 2 3 3
		 *  num++, ++num, num -> 1 3 3 
		 *  num++, num++, num -> 1 2 3
		 *  ++num, ++num, num -> 2 3 3
		 *  
		 *  문제1
		 *  a가 10, b는 20, c는 30입니다.
		 *  a++;					//10
		 *  b = (--a) + b; 			//10+20=30
		 *  c = (a++) + (--b);		//10+29=40
		 *  연산을 끝마친 후
		 *  a, b, c,의 값은 얼마일까요? 11,29,40
		 */
  
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a++);
		System.out.println(b = (--a) + b);
		System.out.println(c = (a++) + (--b));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); 
		
		int aNum = 10;
		int bNum = 20;
		int cNum = 30;
		aNum++;
		bNum = (--aNum) + bNum;
		cNum = (aNum++) + (--bNum);
		System.out.printf("a의 값 : %d, b의 값 : %d, c의 값 : %d\n", aNum, bNum, cNum);
		
		/*
		 *  문제2
		 *  x는 100, y는 33, z는 0입니다
		 *  x--;					//100
		 *  z = x-- + --y;			//99+32=131
		 *  x = 99 + x++ + x;		//99+98+99=296
		 *  y = y-- + y + ++y;		//32+31+32=95        :이 식 '항'이 지나면 지난것으로 침!!
		 *  연산을 끝마친 후
		 *  x, y, z,의 값은 얼마일까요?
		 */
		
		
		int x = 100;
		int y = 33;
		int z = 0;
		System.out.println(x--);
		System.out.println(z = x-- + --y);
		System.out.println(x = 99 + x++ + x);
		System.out.println(y = y-- + y + ++y);
		
		/*
		 * 문제3 - 7, 9, 15, 2, 1, 2, 10, 2, 7
		 * a는 5, b는 10입니다.
		 * c = (++a) + b;		//c=6+10=16
		 * d = c / a;			//d=16/6=2
		 * e = c % a;			//e=16%6=4
		 * f = e++;				//f=4 ->e=5, f=4
		 * g = (--b) + (d--);	//g=9+2=11 -> d=1				//i=6+30%8=6+6=12
		 * h = 2;												//i=6+9/3*10%8
		 * i = a++ + b / (--c / f) * (g-- - d) % (++e + h);		//i=6+9/(15/4)*(11-1)%(6+2) ->a=7,g=10
		 * a: ?, b: ?, c: ?, d: ?, e: ?, f: ?, g: ?, h: ?, i: ?의 값은 무엇일까요?
		 */
		
		a = 5;
		b = 10;
		int d;
		int e;
		int f;
		int g;
		int h=2;
		int i;
		System.out.println(c = (++a) + b);
		System.out.println(d = c / a);
		System.out.println(e = c % a);
		System.out.println(f = e++);
		System.out.println(g = (--b) + (d--));
		System.out.println(i = a++ + b / (--c / f) * (g-- - d) % (++e + h));
	}
}
