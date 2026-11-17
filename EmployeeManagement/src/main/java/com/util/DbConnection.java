package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class DbConnection {
	static Connection connection;
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		 
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(connection == null) {
			connection =	DriverManager.getConnection(Constants.URL,Constants.DB_USER_NAME,Constants.DB_PASSWORD);
			return connection;
		}
		return connection;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
