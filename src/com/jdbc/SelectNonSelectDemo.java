package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectNonSelectDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		//String query="select * from employees";
		String query="update employees set eno=105 where ename='vicky'";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=conn.createStatement();
		boolean b=st.execute(query);
		if(b)
		{
			ResultSet rs=st.getResultSet();
			System.out.println("ENO\tEname\tEsal\tEaddar");
			System.out.println("==============================================");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
			}
		}
		else
		{
			int count=st.getUpdateCount();
			System.out.println("the no of record updated is "+count);
		}
		conn.close();
	}

}
