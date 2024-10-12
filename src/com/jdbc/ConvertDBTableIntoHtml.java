package com.jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConvertDBTableIntoHtml {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		String query="select * from employees";
		String data=" ";
		data=data+"<html><body bgcolor='white' text='black'><centre><table border='2'><tr><td bgcolor='pink'>ENO</td><td bgcolor='yellow'>Ename</td><td bgcolor='pink'>Esal</td><td bgcolor='yellow'>Eaddr</td></tr>";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getDouble(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
		}
		data=data+"</table></centre></body></html>";
		FileOutputStream fos= new FileOutputStream("./employees.html");
		byte [] b=data.getBytes();
		fos.write(b);
		fos.flush();
		System.out.println("open employees.html to get the data");
		fos.close();
	}
}
