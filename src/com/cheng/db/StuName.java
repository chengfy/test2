package com.cheng.db;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StuName {

	public static void main(String[] args) throws SQLException, IOException {
		Connection conn = DBConn.getConn();
		System.out.println(conn);
		String sql = "select distinct name from student order by name";
//		String sql = "select distinct name from student order by name";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		StringBuilder allNames = new StringBuilder();
		while(rs.next()){
			String name = rs.getString(1);
//			System.out.print(name+" ");
			allNames.append(name).append("\r\n");
		}
		Writer wr = new FileWriter("e:/dbData/namesAsc.txt");
		wr.write(allNames.toString());
		wr.close();
	}

}
