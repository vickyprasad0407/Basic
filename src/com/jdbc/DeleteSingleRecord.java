package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteSingleRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=(Statement) con.createStatement();
		int count=st.executeUpdate("delete from employees where ename='Ramesh'");
		System.out.println("the no of row deleted :"+count);
		con.close();
	}

}
