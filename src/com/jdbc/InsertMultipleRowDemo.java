package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMultipleRowDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url, user, pwd);
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee id");
			int eno=sc.nextInt();
			System.out.println("Employee name");
			String ename=sc.next();
			System.out.println("Employee sal");
			double esal=sc.nextDouble();
			System.out.println("Employee address");
			String eadd=sc.next();
			String sql_Query=String.format("insert into employees values(%d,'%s',%f,'%s')", eno,ename,esal,eadd);
			st.executeUpdate(sql_Query);
            System.out.println("record added succesfully....");
            System.out.println("do you want to insert one more record{yes or no}");
            String option=sc.next();
            if(option.equalsIgnoreCase("no"))
            	break;
		}
		con.close();
	}

}
