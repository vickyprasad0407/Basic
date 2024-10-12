package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectPartricularDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String query="select ename,eaddr from employees";
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			st=con.createStatement();
			rs=st.executeQuery(query);
			boolean flag=false;
			System.out.println("ename\teaddr");
			System.out.println("======================");
			while(rs.next())
			{
				flag=true;
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			if(flag==false)
				System.out.println("no record selected.....");
			con.close();
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
