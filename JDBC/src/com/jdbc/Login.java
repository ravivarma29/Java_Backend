package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;
import com.util.DatabaseConnection;

public class Login {

	public static void main(String[] args) throws SQLException {
		
		Statement statement = DatabaseConnection.getStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username :");
		String userName = sc.nextLine();
		
		System.out.println("Enter password :");
		String userPassword = sc.nextLine();
		
//		ResultSet rs = statement.executeQuery("select * from users "
//				+ "where username = ' "+ userName + " 'and password = ' " +userPassword+ " ' ");	
		
		ResultSet rs = statement.executeQuery("select * from users "
				+"where username = '"+userName+"'");
		
		if(rs.next()) 
		{
			if(rs.getString("password").equals(userPassword))
			{
				System.out.println("user Logged in...");
			}
			else 
			{
				System.out.println("Invalid Password");
			}
		}
		else 
		{
			System.out.println("Invalid Username");
		}

	} 

}
