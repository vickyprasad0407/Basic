package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRangeOfRecordsBasedOnInitialCharacter {

	static Connection con=null;
	static Statement st; 
	static ResultSet rs;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial character of employee name");
		String initialChar=sc.next();
		String sql_query=String.format("select * from employees where ename like '%s'", initialChar);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			 st=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        	try {
				 rs=st.executeQuery(sql_query);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        boolean flag=false;
        System.out.println("eno\tename\tesal\teaddr");
        System.out.println("======================================");
        try {
			while(rs.next())
			{
				flag=true;
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        if(flag==false)
        	System.out.println("No record available");
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
