package com.jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;	
import java.sql.Statement;

public class InsertingDataToDB {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/mydata2";
		String uname = "root";
		String pass = "Hams@123";
		String query = "insert into Person values (4,'Mohini')";
		String userData = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
			System.out.println(count + "rows affected");
			
		
		st.close();
		con.close();
		
	}

}
