package com.phwana.javarecap.student.model;

import java.util.ArrayList;
import java.util.List;

import com.phwana.javarecap.student.model.vo.Student;

public class StudentManage {
	//Student [] student = new Student[10];
	private List<Student> sList;
	
	//리스트 객체 생성
	public StudentManage() {
		sList = new ArrayList<Student>();  //누락주의보!!!!
	}//이걸 내일 DB로 실행시킴

	//정보입력
	public void insertStudent(Student student) {
		sList.add(student);
	}
	public void updateStudent(int index, Student student) {
		Student stdOne = sList.get(index);
		student = new Student(
				stdOne.getName()
				, student.getFirstScore()
				, student.getSecondScore());				
		sList.set(index, student);
	}
	public void deleteStudent(String name) {
		List<Student> searchList = this.searchListByName(name);
		for(Student student: searchList) {
			sList.remove(student);
		}
	}
	//전체정보리턴
	public List<Student> getStudents(){
		return sList;
	}

	//이름으로 정보 검색
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>();
		for(Student student: sList) {
			if(student.getName().equals(name)) {
				//찾으면 리스트에 추가
				searchList.add(student);
			}
		}
//		return null;
		return searchList;
	}

	public int searchIndexByName(String name) {
		int index = 0;
		for(Student student: sList) {
			if(student.getName().equals(name)) {
				return index;
			}
			index++;
		}
		return -1;//없다는 표시
	}


}
