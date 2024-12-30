package com.phwana.day2x.innerclass;

public class MonsterBall {
	int size = 100;
	int price = 5000;
	
	//메소드 안에 존재하는 로컬 클래스
	void showPokemonster() {
		int exp = 4000;
		
		class PoketMonster {
			String name = "꼬부기";
			int level = 100;
			
			public void getPocketLevel() {
				System.out.println(level);
				System.out.println(exp);
			}
		}
	}
	
	//static을 붙이면 객체 생성 없이 쓸 수 있다
	//static 클래스는 static 멤버만 불러올 수 있다
	
	//static이 아닌 경우 외부와 연결되어 있는 외부 참조를 갖게 됨
	//메모리가 더 사용되고 느려지므로 static 권장
	static class PocketMonster{
		String name = "이상해씨";
		int level = 100;
		static final int cost = 1000;
		//인스턴스 클래스 내부에서는 static final 상수만 선언가능
		//static을 쓰려면 final을 붙여서 써야 한다(jdk15이전)
		//(jdk16부터) 인스턴스 클래스 내부에서 static 선언가능
		
		public void getPocketMemeber() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost);
			
			//전역변수(?)처럼 외부의 것도 가져다 쓸 수 있다
//			System.out.println(size);
//			System.out.println(price);
		}
	}
	
	public static void main(String[] args) {
		MonsterBall ball = new MonsterBall();
		//new MonsterBall.PocketMonster();
		MonsterBall.PocketMonster pokemon = new PocketMonster();//ball.만빼서씀
		pokemon.getPocketMemeber();
	}
}
