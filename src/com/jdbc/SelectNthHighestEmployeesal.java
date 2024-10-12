package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectNthHighestEmployeesal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter highest sal number");
		int n=sc.nextInt();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=conn.createStatement();
		System.out.println("ENo\tEname\tEsal\tEaddr");
		System.out.println("===================================================");
		String query="select * from employees where esal in (select esal from (select esal,rownum slno from (select esal from employees order by esal desc))where slno='"+n+"')";
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
	    conn.close();
	}

}
