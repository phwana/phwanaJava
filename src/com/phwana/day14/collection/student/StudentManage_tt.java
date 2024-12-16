package com.phwana.day14.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage_tt implements ManageInterface{
	
	private List<Student> sList;
	
	public StudentManage_tt() {
		sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		sList.add(student);
	}

	@Override
	public List<Student> searchListByName(String name) {
		if(name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std: sList) {
				if(name.equals(std.getName())) {
					// 찾은 데이터
					searchList.add(std); // 저장
				}
			}
			return searchList;
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int index) {
		// TODO Auto-generated method stub
		
	}
	
}
