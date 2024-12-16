package com.phwana.day14.collection.student;

import java.util.List;

//extends??
public interface ViewInterface {//퍼블릭 생략 가능
	Student inputStudent();
	
	void displayStudents(List<Student> stdList);
	
	int printMenu();
	
	void displayMsg(String msg);
	
	String inputName(String category);
	
	Student modifyStudent(Student student);

}
