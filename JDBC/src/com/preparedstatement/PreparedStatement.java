package com.preparedstatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.DatabaseConnection;

public class PreparedStatement {
	public static void main(String[] args) throws SQLException {
		
	Connection connection = DatabaseConnection.getConnection();
	
	String query = "select * from users where username =? and password =?";
	java.sql.PreparedStatement statement = connection.prepareStatement(query);
	//checking dynamic
//	statement.setInt(1, 3);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter username :");
	String username = sc.nextLine();
	System.out.println("Enter password :");
	String password = sc.nextLine();
	
	statement.setString(1, username);
	statement.setString(2, password);
	
	
	ResultSet rs =statement.executeQuery();
	
	
	if(rs.next())
	{
		System.out.println(" user logged in");
	}
	else
	{
		System.out.println("Invalid credentials");
	}
//	while(rs.next())
//	{
//		System.out.println(rs.getInt(1) +" " +  rs.getString(2) + " " +rs.getString(3));
//	}
//	
	}
}
