package com.iu.start.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	//getConnction
	//DB����	
	public static Connection getConnection() throws Exception{
		//1. �α������� : ID, PASSWORD, URL, DRIVER
		String user = "hr";
		String password = "hr";
		String url="jdbc:oracle:thin:@192.168.7.20:1521:xe";
		String driver="oracle.jdbc.OracleDriver";
		
		//2. DRIVER�� �޸𸮿� �ε�
		Class.forName(driver);
		
		//3. CONNECTION ��ü ����
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con; //����Ȯ�� �׽�Ʈ �ؾ���(null or excetion �߸� �̿���)
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