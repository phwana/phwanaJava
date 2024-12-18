package com.phwana.day13.oop;
//데이터 처리
//저장하고 로드하는 기능 클래스
public class StudentManage {
	private Student [] students;//(배열) 선언
	private int index;
	
	public StudentManage() {
		students = new Student[3];//(배열) 초기화
		index = 0;
	}
	
	public void insertStudent(Student student) {
		students[index]=student;
		index++;
	}
	public Student [] getStudents() {
		return students;
	}

}
