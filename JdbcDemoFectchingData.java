package com.jdbc.com;
import java.sql.*;
public class JdbcDemoFectchingData {
	
	/* 1.import -->java.sql
	 * 2.load driver --->com.mysql.jdbc.Driver
	 * Create connection
	 * create statement
	 * execute query
	 * process the results
	 * close
	 */
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/mydata2";
		String uname = "root";
		String pass = "Hams@123";
		String query = "select * from colleagues";
		String userData = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			userData = rs.getInt(1)+" :"+rs.getString(2);
			System.out.println(userData);
			
		}
		st.close();
		con.close();
		
	}

}
