package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRangeOfRecordsBasedOnAddress {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the City name");
		String city=sc.next();
		String sql_query=String.format("Select * from employees where eaddr='%s'",city);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott", "tiger");
		Statement st=con.createStatement();
		boolean flag=false;
		ResultSet rs=st.executeQuery(sql_query);
		System.out.println("Eno\tEname\tEsal\tEAddr");
		System.out.println("=================================================");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		if(flag==false)
			System.out.println("no matched record found...");
		con.close();
		
	}

}
