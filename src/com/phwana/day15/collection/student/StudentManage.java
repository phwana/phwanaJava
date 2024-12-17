package com.phwana.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

//return 거기로가라, null은 if문이 동작을 안하면 
public class StudentManage implements ManageInterface{
	private List<Student> sList;
	
	public StudentManage() {
		this.sList = new ArrayList<Student>();
	}//배열생기듯 공간이 생김

	@Override
	public void registerStudent(Student student) {
		sList.add(student);
		
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);	
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);//몇번째 값인지 알아야 해서 index필요
		//인덱스로 sList에서 삭제
		
	}

	@Override
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>();//이렇게만 return하면 비어있는 값
		if(name != null){//null이 아니면 감싸주고->입력되었을 때만 동작하도록
			for(Student std: sList) {//sList를 검색하여 name과 같은값 찾기
				if(name.equals(std.getName())) {//같은값을 찾으면
					searchList.add(std);//searchList에 추가
				}
			}
			return searchList;
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student std: sList) {
				if(name.equals(std.getName())) {
					return std; //찾으면 그때의 값을 리턴
				}
			}
		}
		return null; //없으면 null 리턴
	}

	@Override
	public int searchIndexByName(String name) {
		int count =0;//forEach는 i가 없어서 선언
		if(name != null) { //nam을 입력했을 때 동작
			for(Student std: sList) { //forEach문으로 동작
				if(name.equals(std.getName())) {//이름이 같은지 확인
				return count; //그때의 인덱스 리턴
				}
				count++; //이름이 다르면 인덱스 증가
			}
		}
		return -1; //없으면 -1리턴
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}
//바로 출력하지 않고 스트링으로 모아서 컨트롤로 보낸다
	public String searchfailResult(Student student) {//이름으로 찾은 학생 정보 넘어옴
		if(student != null) {//정보 있을 때 동작
			int firstScore, secondScore;
			firstScore = student.getFirstScore();
			secondScore = student.getSecondScore();		//1,2차 점수 설정
			double avg = (firstScore+secondScore)/2.0;	//평균구하기
			StringBuffer sb=new StringBuffer();			//결과값(String) 담을 객체
			if(avg>=60) {
				if(firstScore<40) {
					sb.append("1차 시험 재평가");//출력대신 해당값 넣어주는 것으로 바꿈
				}else if (secondScore<40) {
					sb.append("2차 시험 재평가");
				}else {				
					sb.append("모두 통과하셨습니다.");
				}									//3가지 결과 중 1개만 담김
			}else {
				if(firstScore<60) {
					sb.append("1차 시험 재평가\n");	//개행해서 출력되도록 \n
				}
				if(secondScore<60) {
					sb.append("2차 시험 재평가");
				}									//2가지 결과가 담길 수 있음
			}
			return sb.toString();
		}
		return null;
	}
	
	

}
