package com.phwana.day14.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage_t implements ManageInterface{
	
	private List<Student> sList;
	
	public StudentManage_t() {
		this.sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public List<Student> searchListByName(String name) {
		// TODO Auto-generated method stub
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
