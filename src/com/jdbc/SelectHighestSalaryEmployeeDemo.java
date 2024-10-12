package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectHighestSalaryEmployeeDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employees where esal in (select max(esal) from employees)");
		System.out.println("Eno\tEname\tEsal\tEaddr");
		System.out.println("================================");
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		con.close();
	}

}
