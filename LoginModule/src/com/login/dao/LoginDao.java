package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//  uname = dolma and pass = 123 in my mysql db.

public class LoginDao 
{
	String sql = "select * from login where uname=? and pass=?"; 
	String url = "jdbc:mysql://localhost:3306/dolma";
	String username = "root";
	String password = "Kungapasang3";
	public boolean check(String uname,String pass)
	{
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, uname); // question mark in above sql is replaced by uname and pass
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		if(rs.next()) // if next row is not null and data entered matches with that in db then return true 
		{	           
		
			return true;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
