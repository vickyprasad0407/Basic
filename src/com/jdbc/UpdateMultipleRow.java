package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the increment amount");
		double increment=sc.nextDouble();
		System.out.println("Enter the salaty range");
		double salRange=sc.nextDouble();
		String query=String.format("update employees set esal=esal+%f where esal<%f", increment,salRange);
		int count=st.executeUpdate(query);
		System.out.println("the no of row updated "+count);
		con.close();
	}

}
