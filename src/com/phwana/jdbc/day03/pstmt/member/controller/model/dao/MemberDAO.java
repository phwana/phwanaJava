package com.phwana.jdbc.day03.pstmt.member.controller.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.phwana.jdbc.day03.pstmt.member.controller.model.vo.Member;


public class MemberDAO {

//	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
//	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	private static final String USERNAME = "KH";
//	private static final String PASSWORD = "KH";
	private static final String FILE_NAME = "resources/query.properties";
	private Properties prop;
	
	public MemberDAO() {
		try {
			Reader reader = new FileReader(FILE_NAME);
			prop = new Properties();
			prop.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		/*
		 * 1. Query문에 위치홀치(??)
		 * 2. PreparedStatement 생성
		 * 3. 위치홀더에 값 셋팅
		 * 4. 쿼리문 실행(query문 전달x)
		 */
		
		// 회원 가입
		public int insertMember(Connection conn, Member member) {
			String query = "INSERT INTO MEMBER_TBL(MEMBER_ID, MEMBER_PWD, MEMBER_NAME, AGE)"
					+ " VALUES('"+member.getMemberId()+"', '"+member.getMemberPwd()+"', '"+member.getMemberName()+"', "+member.getAge()+")";
			query = "INSERT INTO MEMBER_TBL(MEMBER_ID, MEMBER_PWD, MEMBER_NAME, GENDER, AGE)"
					+ " VALUES(?, ?, ?, ?, ?)";
			query = prop.getProperty("insertMember");
			int result = 0;
//			Connection conn = null;
			Statement stmt = null;
			PreparedStatement pstmt = null;
			try {
//				conn = this.getConnection();
				stmt = conn.createStatement();
				result = stmt.executeUpdate(query); // 여기서 예외가 발생하면 close() 코드는 실행되지 않음.
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, member.getMemberId());
				pstmt.setString(2, member.getMemberPwd());
				pstmt.setString(3, member.getMemberName());
				pstmt.setString(4, member.getGender());
				
				result = pstmt.executeUpdate();
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 예외가 발생하든 안하든 실행문을 동작시켜줌.
				try {
					pstmt.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
		}

		// 회원정보 수정
		public int updateMember(Connection conn, Member member) {
			int result = 0;
//			String query = "UPDATE MEMBER_TBL SET MEMBER_PWD = '"+member.getMemberPwd()
//												+"', EMAIL = '"+member.getEmail()
//												+"', PHONE = '"+member.getPhone()
//												+"', ADDRESS = '"+member.getAddress()
//												+"', HOBBY = '"+member.getHobby()
//												+"' WHERE MEMBER_ID = '"+member.getMemberId()+"'";
			String query = "UPDATE MEMBER_TBL SET MEMBER_PWD = ?, EMAIL =?, PHONE = ?, ADDRESS = ?, HOBBY = ? WHERE MEMBER_ID = ?";
			query = prop.getProperty("updateMember");
//			Connection conn = null;
			Statement stmt = null;
			PreparedStatement pstmt = null;
			try {
//				conn = this.getConnection();
				stmt = conn.createStatement();
				// 쿼리문 실행 코드 누락 주의!!
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, member.getMemberPwd());
				pstmt.setString(2, member.getEmail());
				pstmt.setString(3, member.getPhone());
				pstmt.setString(4, member.getAddress());
				pstmt.setString(5, member.getMemberId());
				pstmt.setString(6, member.getMemberId());
				
				// 쿼리문 실행 코드 누락 주의!!
				//result = stmt.executeUpdate(query);
				result = pstmt.executeUpdate(query);
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					// finally에서 자원해제!!
					pstmt.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
		}
		
		public int deleteMember(Connection conn, String memberId) {
			int result = 0;
			String query = "DELETE FROM MEMBER_TBL WHERE LOWER(MEMBER_ID) = LOWER('"+memberId+"')";
			query = "DELETE FROM MEMBER_TBL WHERE LOWER(MEMBER_ID) = ?";
			query = prop.getProperty("deleteMember");
//			Connection conn = null;
			Statement stmt = null;
			PreparedStatement pstmt = null;
			try {
//				conn = this.getConnection();
				// Statement 생성
				stmt = conn.createStatement();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, memberId);
				// 쿼리문 실행
				result = pstmt.executeUpdate(query);
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					pstmt.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// 성공여부를 알 수 있도록 result를 리턴해줌
			return result;
		}
		
		// 회원 전체 정보 조회
		public List<Member> selectList(Connection conn) {
			List<Member> mList = new ArrayList<Member>();
//			String query = "SELECT * FROM MEMBER_TBL";
			String query = "SELECT * FROM MEMBER_TBL ORDER BY ENROLL_DATE DESC";
			query = prop.getProperty("selectList");
//			Connection conn = null;
			Statement stmt = null;
			ResultSet rset = null;
			try {
//				conn = this.getConnection();
				stmt = conn.createStatement();
				rset = stmt.executeQuery(query);
				// rset에 테이블형태로 데이터가 있으나 그대로 사용못함
				// rset을 member에 담아주는 코드를 작성해주어야 함.
				// 그럴때 사용하는 rset의 메소드가 next(), getString(), ...이 있음.
				while(rset.next()) {
					Member member = this.rsetToMember(rset);
					// while문이 동작하면서 모든 레코드에 대한 정보를
					// mList에 담을 수 있도록 add 해줌
					mList.add(member);
				}
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rset.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			// 리턴을 null로하면 NullPointerException 발생
			// mList로 리턴해주어함.
			return mList;
		}

		// 회원 아이디로 검색
		public Member selectOneById(Connection conn, String memberId) {
			// 실행 쿼리문
			String query = "SELECT * FROM MEMBER_TBL WHERE MEMBER_ID = '"+memberId+"'";
			query = "SELECT * FROM MEMBER_TBL WHERE MEMBER_ID =?";//(1)
			query = prop.getProperty("selectOneById");
			Member member = null;
//			Connection conn = null;
			Statement stmt = null;
			PreparedStatement pstmt = null;//(2)
			ResultSet rset = null;
			try {
//				conn = this.getConnection();
				// 쿼리문 실행
				stmt = conn.createStatement(); // SQL문 실행하기 위한 객체
				pstmt = conn.prepareStatement(query);//(3)
				pstmt.setString(1, memberId);//(4)쿼리문 실행준비 완료
				// 결과 받기
//				rset = stmt.executeQuery(query);
				rset = pstmt.executeQuery();//(5)쿼리가 없음 꼭 기억
				// rsetToMember
				// 후처리 
				if(rset.next()) {
					member = this.rsetToMember(rset);
				}
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 자원해제
				try {
					rset.close();
					stmt.close();
					pstmt.close();//(6)
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return member;
		}


		

	// rset을 넘겨받아서 member객체 저장해주는 메소드
	private Member rsetToMember(ResultSet rset) throws SQLException {
		String memberId   = rset.getString("MEMBER_ID");
		String memberPwd  = rset.getString("MEMBER_PWD");
		String memberName = rset.getString("MEMBER_NAME");
		String gender 	  = rset.getString("GENDER");
		int    age 		  = rset.getInt("AGE");
		String email 	  = rset.getString("EMAIL");
		String phone 	  = rset.getString("PHONE");
		String address 	  = rset.getString("ADDRESS");
		String hobby 	  = rset.getString("HOBBY");
		Date enrollDate   = rset.getDate("ENROLL_DATE");
		Member member = new Member(memberId, memberPwd, memberName
				, gender, age, email, phone
				, address, hobby, enrollDate);
		return member;
	}
	
//	private Connection getConnection() throws ClassNotFoundException, SQLException {
//		Class.forName(DRIVER_NAME);
//		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//		return conn;
//	}->JDBCTemplate으로 감
}
