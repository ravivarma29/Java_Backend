package com.jdbc;

import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;
import com.util.DatabaseConnection;

public class MetaData {
	public static void main(String[] args) {
		Statement statement = DatabaseConnection.getStatement();
		ResultSet rs = statement.executeQuery("select * from users");
		
		while(rs.next())
		{
			System.err.println(rs.getInt(1)  + rs.getString(2) + rs.getString(3));
		}
		
		rs.getMetaData();
	}

}
