package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RowContDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) from emp");
		if(rs.next())
			System.out.println("the no of row is "+rs.getInt(1));
		con.close();
	}

}
