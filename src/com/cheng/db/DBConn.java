package com.cheng.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	public static Connection getConn() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:Oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "cheng", "Acheng");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
