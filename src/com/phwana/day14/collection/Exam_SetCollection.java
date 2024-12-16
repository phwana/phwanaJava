package com.phwana.day14.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {
	public static void main(String [] args) {
		//Collection -> 저장소의 역할
		//자료구조의 특성에 따라서 선택해서 사용
		//List, Set, Map, Stack, Queue, ...
		//Set은 순서가 없고 중복이 되지 않음.
		//->중복을 제거할 수 있음.
		
		//인터페이스/ ?? /변수
		Set<String> fruitsSet = new HashSet<String>();
		String [] fruitsArrs = {"체리", "딸기", "포도", "사과", "딸기", "체리"};
		//반복문을 이용해서 넣어보세요? -> foreach문
		for(String fruits : fruitsArrs) {
			fruitsSet.add(fruits);
		}
//		fruitsSet.add("딸기");
//		fruitsSet.add("체리");
//		fruitsSet.add("사과");
//		fruitsSet.add("포도");
//		fruitsSet.add("딸기");//중복
//		fruitsSet.add("체리");//중복
		System.out.println("크기 : "+fruitsSet.size());
		/*
		 * 수학의 집합: 순서 중요하지 않음. 중복허용하지 않음
		 * 중복 있는 데이터들을 Set에 넣으면 중복제거
		 * ->만약 저장소에서 데이터 꺼내 쓰려면
		 * 순서 있는 경우에 Index활용하지만 set처럼 순서없으면 지시자 사용
		 */
		Iterator<String> it = fruitsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString()); //순서보장x
		}
	}
}
