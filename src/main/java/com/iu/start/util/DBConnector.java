package com.iu.start.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	//getConnction
	//DB연동	
	public static Connection getConnection() throws Exception{
		//1. 로그인정보 : ID, PASSWORD, URL, DRIVER
		String user = "hr";
		String password = "hr";
		String url="jdbc:oracle:thin:@192.168.7.20:1521:xe";
		String driver="oracle.jdbc.OracleDriver";
		
		//2. DRIVER로 메모리에 로딩
		Class.forName(driver);
		
		//3. CONNECTION 객체 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con; //연결확인 테스트 해야함(null or excetion 뜨면 미연결)
	}
	
	public static void disConnection(PreparedStatement st, Connection con) {
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void disConnection(ResultSet rs, PreparedStatement st, Connection con) {
		try {
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}