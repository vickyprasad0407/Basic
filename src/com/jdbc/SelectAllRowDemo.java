package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectAllRowDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_Url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="tiger";
		String query="select * from employees order by esal desc";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_Url, user, pwd);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean flag=false;
		System.out.println("ENo\tEname\tEsal\tEaddr");
		System.out.println("==================");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt("eno")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
		}
		if(flag==false)
			System.out.println("no matched records.......");
		con.close();
	}
}
