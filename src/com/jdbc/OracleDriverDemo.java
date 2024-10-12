package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class OracleDriverDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DriverManager.registerDriver(new OracleDriver());
		//Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		ResultSet rs=con.createStatement().executeQuery("select * from emp");
		while (rs.next())
		{
			System.out.println(rs.getString(3));
		}
		con.close();
	}
}
