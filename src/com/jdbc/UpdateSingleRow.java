package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSingleRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=con.createStatement();
		int updateCount=st.executeUpdate("update employees set esal=8000 where ename='Mukesh'");
		System.out.println("no of row updated is "+updateCount);
		con.close();
	}

}
