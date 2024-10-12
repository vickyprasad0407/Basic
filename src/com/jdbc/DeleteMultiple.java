package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultiple {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cuttoff salary");
		double cutOff=sc.nextDouble();
		String sql_Query=String.format("delete from employees where esal>%f", cutOff);
		int updateCount=st.executeUpdate(sql_Query);
		System.out.println("The no of row deleted is "+updateCount);
		con.close();
	}

}
