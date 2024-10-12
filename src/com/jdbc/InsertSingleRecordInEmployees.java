package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSingleRecordInEmployees {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="tiger";
		String query="insert into  employees values(101,'Ramesh',5000,'Delhi')";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url, user, pwd);
		Statement st=con.createStatement();
		int update=st.executeUpdate(query);
		System.out.println("no. of row updated is "+update);
		con.close();
		
	}

}
