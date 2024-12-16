package com.phwana.day14.collection.student;

import java.util.List;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		while(true) {
			int menu =view.printMenu();
			switch(menu) {
			case 1: 
				Student student = view.inputStudent();
				manage.registerStudent(student);
				break;
			case 2: 
				List<Student> sList = manage.selectAllStudents();
				view.displayStudents(sList);
				break;
			case 0: 
				view.displayMsg("프로그램이 종료되었습니다.");
				break;
			default: 
				view.displayMsg("잘못입력하셨습니다.");
				break;
			}
		}
		
	}

}
