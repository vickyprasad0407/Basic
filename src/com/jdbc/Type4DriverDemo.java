package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

import oracle.jdbc.OracleDriver;

public class Type4DriverDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DriverManager.registerDriver(new Driver());
		//Class.forName("com.mysql.cj.jdbc.Driver.");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet45", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from studentinfo;");
		while (rs.next())
		{
			System.out.println(rs.getString(2));
		}
		con.close();
		
	}
}
