package com.phwana.jdbc.day03.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRun {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "STUDENT";
	private static final String PASSWORD = "STUDENT";

	public static void main(String[] args) {
		//DML JDBC
		String query = "INSERT INTO STUDENT_TBL VALUES('user02', 'pass02', '이올라', 'F', 23, 'user02@ola.com', '01082829393', '경기도 남양주시', '수영, 클라이밍', DEFAULT)";
		query = "INSERT INTO STUDENT_TBL VALUES(?,?,?,?,?,?,?,?,?,DEFAULT)";
		try {
			//1.드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.DBMS 연결
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//3.Prepared/Statement생성
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "user03");
			pstmt.setString(2, "pass03");
			pstmt.setString(3, "삼올라");
			pstmt.setString(4, "F");
			pstmt.setInt(5, 33);
			pstmt.setString(6, "user03@ola.com");
			pstmt.setString(7, "01099887766");
			pstmt.setString(8, "경기도 광주시");
			pstmt.setString(9, "코딩, 수영");
			//4.SQL 전송 및 5.결과받기
			int result = stmt.executeUpdate(query);
			result = pstmt.executeUpdate(query);
			if(result >0) {
				System.out.println("데이터가 저장되었습니다.");
			}else {
				System.out.println("데이터 저장이 완료되지 않았습니다.");
			}
			//6.자원해제
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dqlJDBC() {
		String query = "SELECT * FROM STUDENT_TBL";
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			//1. 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			//2. DBMS 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",
					 "STUDENT",
					 "STUDENT");
			
			//3. Prepared/Statement 생성
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(query);
			//pstmt.setString(1, memberId); 위치홀더 있으면 생략 불가능!!!!!!!!!!!
			
			//4. SQL 전송 및 5. 결과받기
//			rset = stmt.executeQuery(query);
			rset = stmt.executeQuery();
			
			while(rset.next()) {
				System.out.println("ID : "+rset.getString("STUDENT_ID"));
				System.out.println("NAME : "+rset.getString("STUDENT_NAME"));
				System.out.println("AGE : "+rset.getInt("AGE"));
				System.out.println("DATE : "+rset.getDate("ENROLL_DATE"));
				
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6.자원해제
			rset.close();
			stmt.close();
			conn.close();
			}
		}
	}
