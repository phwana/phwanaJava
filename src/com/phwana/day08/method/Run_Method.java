package com.phwana.day08.method;

public class Run_Method {
	public static void main(String[] args) {
		Exam_Method em = new Exam_Method();
		//리턴형x, 매개변수x
		em.noReturnNoparam();
		//리턴형x, 매개변수o
		em.noReturnYesParam(20250502);
		//리턴형o, 매개변수x
		System.out.println(em.yesReturnNoParam());
		//리턴형o, 매개변수o
		int result = em.yesReturnYesParam(1000);
		System.out.println(result);
			//매배변수o->리터럴 넣어줘야 함
		
		result = em.sum(1,2,3,4,5);
		System.out.println("result : "+result);
	}
}

