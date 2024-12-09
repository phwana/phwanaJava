package com.phwana.day09.objectarray;

class Student{
	String name;
	int kor;
	int eng;
	int math;
	//기본생성자(생략가능), JVM이 알아서 생성해줌
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() { //void를 필요한 자료형으로 바꿔라(int,double)
		return kor+eng+math;
	}
	public double avg() {
		return (kor+eng+math)/3.0;
	}
}

public class StudentArray {
	public static void main(String [] args) {
		Student [] students = new Student[3];
		students[0] = new Student("일용자", 99, 88, 77);
//		students[0].name = "일용자";
//		students[0].kor = 99;
//		students[0].eng = 88;
//		students[0].math = 77;
		students[1] = new Student("이용자", 99, 88, 77);

		students[2] = new Student("삼용자", 99, 88, 77);

		
		// 반복문을 이용하여 객체배열의 객체가 가지고 있는 
		// 이름, 점수, 총점, 평균을 출력해봐라.
		
		for(int i=0; i<students.length ; i++) {
			
			System.out.println("이름 : "+students[i].name);
			System.out.println("국어 : "+students[i].kor);
			System.out.println("영어 : "+students[i].eng);
			System.out.println("수학 : "+students[i].math);
			System.out.println("평균 : "+students[i].total());
			System.out.println("총점 : "+students[i].avg());
		}
		
	}

}
