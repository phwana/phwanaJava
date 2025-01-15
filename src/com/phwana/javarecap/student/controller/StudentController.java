package com.phwana.javarecap.student.controller;

import java.util.List;
import java.util.Scanner;

import com.phwana.javarecap.student.model.StudentManage;
import com.phwana.javarecap.student.model.vo.Student;
import com.phwana.javarecap.student.view.StudentView;

public class StudentController {
	
	private static final String BYE_MSG = "프로그램이 종료되었습니다.";
	private static final String DATA_NO_FOUND = "데이터가 존재하지 않습니다.";
	private static final String SEARCH_ITEM = "검색";
	private static final String DEL_ITEM = "삭제";
	private static final String DEL_MSG = "데이터가 삭제되었습니다.";
	private static final String MOD_ITEM = "수정";
	private static final String MOD_MSG = "데이터가 수정되었습니다.";
	
	public static void main(String[]args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		end: //무한반복 바깥으로 지정해주면 종료
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
				case 1: 
					Student student = view.inputStudent();
					manage.insertStudent(student);
					view.inputStudent();
					break;
				case 2: 
					String name = view.inputName(MOD_ITEM);
					int index = manage.searchIndexByName(name);
					if(index>-1) {
						student = view.modifyScore();
						manage.updateStudent(index, student);
						view.printMessage(MOD_MSG);
					}
					break;
				case 3: 
					name = view.inputName(DEL_ITEM);
					manage.deleteStudent(name);
					view.printMessage(DEL_MSG);
					break;
				case 4: 
					List<Student> sList = manage.getStudents();
					view.printAllStudents(sList);
					break;
				case 5: 
					name = view.inputName(SEARCH_ITEM);
					sList = manage.searchListByName(name);
//					if(sList.isEmpty()) {같은것
					if(sList.size()>0) {
						view.printAllStudents(sList);
					}else {
						view.printMessage(DATA_NO_FOUND);
					}
					break;
				case 0: 
					view.printMessage(BYE_MSG);
					break end;
				default : break;		
			}
		}
	}
}
