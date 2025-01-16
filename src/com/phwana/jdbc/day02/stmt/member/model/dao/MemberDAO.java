package com.phwana.jdbc.day02.stmt.member.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.phwana.jdbc.day02.stmt.member.model.vo.Member;

public class MemberDAO {
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String USERNAME = "KH";
	private static final String PASSWORD = "KH";

	/*
	 * 여기서 JDBC 코딩 할거임
	 * 1. 드라이버 등록
	 * 2. DBMS 연결 생성
	 * 3. Statement 생성
	 * 4. SQL 전송
	 * 5. 결과받기
	 * 6. 자원해제
	 */

	// 회원 가입
	public int inserMember(Member member) {
		String query = "INSERT INTO MEMBER_TBL(MEMBER_ID, MEMBER_PWD, MEMBER_NAME, GENDER, AGE)"
				+ "VALUES('"+member.getMemberId()+"', '"+member.getMemberPwd()+"', '"+member.getMemberName()+"', '"+member.getGender()+"', "+member.getAge()+")";
		int result = 0;
		Connection conn = null;
		Statement stmt = null;
		try {
//			Class.forName(DRIVER_NAME);
			conn = this.getConnection();
//			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int updateMember(Member member) {
		int result = 0;
		String query = "UPDATE MEMBER_TBL SET MEMBER_PWD = '"+member.getMemberPwd()
		+"', EMAIL = '"+member.getEmail()+"', PHONE = '"+member.getPhone()
		+"', ADDRESS = '"+member.getAddress()+"', HOBBY = '"+member.getHobby()+"' WHERE MEMBER_ID='"+member.getMemberId()+"'";
//		query = "UPDATE MEMBER_TBL SET MEMBER_PWD = '', EMAIL = '', PHONE = '', ADDRESS = '', HOBBY = '', WHERE MEMBER_ID = ''";
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = this.getConnection();
			stmt = conn.createStatement();
			//쿼리문 실행 코드 누락 주의!!
			result = stmt.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int deleteMember(String memberId) {
		int result = 0;
		Connection conn = null;
		Statement stmt = null;
		String query = "DELETE FROM MEMBER_TBL WHERE LOWER(MEMBER_ID) = LOWER('"+memberId+"')";
		try {
			conn = this.getConnection();
			stmt = conn.createStatement();
			//쿼리문 실행
			result = stmt.executeUpdate(query);//여기서 예외가 발생하면 close() 코드는 실행되지 않음

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//finally 자원해제 해주냐 안하냐가 시험포인트가 될 수 있다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			//예외가 발생하든 안하든 실행문을 동작시켜줌
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//성공여부를 알 수 있도록 result리턴해줌
		return result;
	}

	// 회원 전체 정보 조회
	public List<Member> selectList() {
		List<Member> mList = new ArrayList<Member>();
		String query = "SELECT * FROM MEMBER_TBL ORDER BY ENROLL_DATE DESC";//등록 순서로 정렬
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			conn = this.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			//rset에 테이블형태로 데이터가 있으나 그대로 사용못함
			//rset을 member에 담아주는 코드를 작성해주어야 함
			//그럴때 사용하는 rset의 메소드가 next(), getString(), ... 이 있음
			while(rset.next()) {
				Member member = this.rsetToMember(rset);
				//while문이 동작하면서 모든 레코드에 대한 정보를
				//mList에 담을 수 있도록 add 해줌
				mList.add(member);
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
			//모듈화로 코드를 줄여보자
			
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//리턴을 null로하면 널포인트익셉션 발생
		//mList로 리턴해주어야 함
		return mList;
	}
	
	// 회원 아이디로 검색
	public Member selectOneById(String memberId) {
		String query = "SELECT * FROM MEMBER_TBL WHERE MEMBER_ID = '"+memberId+"'";
		Member member = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = this.getConnection();
			stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				//rset은 member로 변환되어야 함(rsetToMember)
				member = this.rsetToMember(rset);
			}
			rset.close();
			stmt.close();
			conn.close();
			//rset은 member로 변환되어야 함(rsetToMember)
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return member;
	}

	private Member rsetToMember(ResultSet rset) throws SQLException {
		String MemberId   = rset.getString("MEMBER_ID");
		String MemberPwd  = rset.getString("MEMBER_PWD");
		String MemberName = rset.getString("MEMBER_NAME");
		String gender 	  = rset.getString("GENDER");
		int age 		  = rset.getInt("AGE");
		String email 	  = rset.getString("EMAIL");
		String phone 	  = rset.getString("PHONE");
		String address 	  = rset.getString("ADDRESS");
		String hobby 	  = rset.getString("HOBBY");
		Date enrollDate   = rset.getDate("ENROLL_DATE");
		Member member = new Member(MemberId, MemberPwd, MemberName, gender, age, email, phone, address, hobby, enrollDate);
		return member;
	}

	//여기서 trycatch하지 않고 던진다?
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_NAME);
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return conn;
	}

}
