package com.phwana.day13.oop;
//데이터 처리
//저장하고 로드하는 기능 클래스
/*
 * 최종저장소를 가지고 있으면서
 * View에서 입력받은 데이터를 받아서
 * 저장하거나 필요할 때 로드해주는 클래스로 Manage클래스
 */
public class StudentManage {
//	private List<Student> sList; 컬렉션list로 더 간결하게 가능
	private Student [] students;//(배열) 선언
	private int index;
	
	public StudentManage() {
		students = new Student[3];//(배열) 초기화
		index = 0;
	}
	/*
	 * insertStudent()메소드는 Student 객체를 전달받아서
	 * 최종저장소인 객체배열(리스트)에 저장하는 메소드임
	 * Controller에서 호출함
	 * 호출할 때 student 객체를 넘겨줌
	 * 넘겨주니까 받아야 되고 받아야 되니까 매개변수 작성
	 */
	public void insertStudent(Student student) {
		students[index]=student;
		index++;
	}
	/*
	 * 리턴형은 왜 Student[]인가??(배열)
	 * 이 메소드가 하는 역할은?
	 * 저장소 객체배열 또는 리스트가 가지고 있는 모든 데이터를 로드하는 역할
	 * Controller에서 호출되었을때 모든 데이터가 넘어올것을 기대함
	 * 그 데이터를 넘겨주어야 하고
	 * 넘겨주려면 return students; 또는 return sList;를 써야함
	 * students의 타입이 Student[]이니까
	 * void->Student[]로 변경해주어야 하기 때문에
	 * 리턴형이 Student[]임
	 * 
	 */
	public Student [] getStudents() {
		return students;
	}

}
