package com.phwana.jdbc.day01.stmt.member.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phwana.jdbc.day01.stmt.member.model.vo.Member;

public class MemberDAO {

	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "KH";
	private static final String PASSWORD = "KH";
	String query = "SELECT * FROM MEMBER_TBL";

	public List<Member> selectList() {
		/*
		 * 1. 드라이버 등록
		 * 2. DBMS 연결 생성
		 * 3. Statement 생성
		 * 4. 쿼리문 전송
		 * 5. 결과값 받기
		 * 6. 자원해제
		 */ 
				
		//최종적으로 리턴해줘야 하는 객체
		List<Member> mList = new ArrayList<Member>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			//후처리
			//while문을 돌면서 resultset의 모든 레코드가 mList로 변환됨
			while(rset.next()) {
//				Member member = new Member();
				System.out.println("ID : "+rset.getString("MEMBER_ID"));
				//rset 객체를 추가해줄 수 없으므로 member 객체를 추가
				//그런데 Member member = new Member();는 아무 데이터 없이
				//객체 생성된 상태이고 Member 클래스는 아직 작성하지 않음
				//rsetToMember: rset 객체에 있는 필드값을 Member로 Converting 필요
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				char   gender	= rset.getString("GENDER").charAt(0); //하나자르기
				int	   age		= rset.getInt("AGE");
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				String address = rset.getString("ADDRESS");
				String hobby = rset.getString("HOBBY");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				Member member = new Member(
						memberId, memberPwd, memberName
						, gender, age, email, phone
						, address, hobby, enrollDate);
								
				mList.add(member);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//모든 정보를 담은
		return mList;
	}

	public int insertMember(Member member) {
		//DML JDBC
		String s = "INSERT INTO MEMBER_TBL VALUES('','','','', ,'','','',DEFAULT)";
		String query="INSERT INTO MEMBER_TBL VALUES('"
				+member.getMemberId()+"','"
				+member.getMemberPwd()+"','"
				+member.getMemberName()+"','"
				+member.getGender()+"','"
				+member.getAge()+"','"
				+member.getEmail()+"','"
				+member.getPhone()+"','"
				+member.getAddress()+"','"
				+member.getHobby()+"',DEFAULT)";//시험문제 내기 좋다??????????
		int result = 0;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

	public Member selectOneById(String memberId) {
		String query = "SELECT * FROM MEMBER_TBL WHERE MEMBER_ID = '"+memberId+"'";//홑따옴표 주의
		Member member = null;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			//rset을 그대로 사용할 수 없어서
			//member로 변환해주는 작업을 해야함(rsetToMember)
			while(rset.next()) {
				memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");				
				char gender = rset.getString("GENDER").charAt(0);
				int age = rset.getInt("AGE");
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				String address = rset.getString("ADDRESS");
				String hobby = rset.getString("HOBBY");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				member = new Member(memberId, memberPwd, memberName, gender, age, email, phone, address, hobby, enrollDate);
				
			}
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
