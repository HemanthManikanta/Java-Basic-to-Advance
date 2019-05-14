package com.jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/HemanthDB";
		String uname = "root";
		String pass = "Hams@123";
		int  userid = 6;
		String query = "insert into colleagues values (?,?)";
		String userName = "Divya";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st =  con.prepareStatement(query);
		st.setInt(1,userid);
		st.setString(2,userName);
		int count = st.executeUpdate();
		
			System.out.println(count + "rows affected");
			
		
		st.close();
		con.close();
		
	}


}
