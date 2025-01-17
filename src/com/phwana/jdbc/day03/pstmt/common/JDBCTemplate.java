package com.phwana.jdbc.day03.pstmt.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {

private static final String FILE_NAME = "resources/dev.properties";
//	dev.properties에 저장
//	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
//	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	private static final String USERNAME = "KH";
//	private static final String PASSWORD = "KH";
//	어떤 파일을 불러들일 때 '스트림'(input숫자?/reader문자?) 사용 
	
	/*
	 * Connection에 싱글톤을 적용하는 이유는 Connection Pool
	 * (연결을 생성해서 Pool에 넣고 재사용할 수 있는 기술)을 사용하려고 하는 것이지만
	 * 싱글톤을 적용하고 Connection Pool이 동작하는 코드는 없기 때문에 적용하지 않음
	 * 
	 * Connection을 만드는 메소드를 가지고 있는 JDBCTemplate에 싱글톤을 적용하여 사용함
	 */
	private Properties prop;

	private static JDBCTemplate instance;
		
	private JDBCTemplate() {
		try {
			Reader reader = new FileReader(FILE_NAME);	//스트림 열어서 파일 읽기
			prop = new Properties();					//읽은 파일 사용하기
			prop.load(reader);							//사용 준비 완료
			String driverName = prop.getProperty("driverName");
			Class.forName(driverName);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static JDBCTemplate getInstance() {
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}

	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		conn = DriverManager.getConnection(url, userName, password);		
		//싱글턴쓰니까 이프문 없어도 됨
//		if(conn==null) {
		return conn;
	}

}
