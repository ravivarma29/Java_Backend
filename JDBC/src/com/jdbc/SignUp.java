package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DatabaseConnection;

public class SignUp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Statement statement = (Statement) DatabaseConnection.getStatement();
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter username :");
			String userName = sc.nextLine();
			
			System.out.println("Enter password :");
			String userPassword = sc.nextLine();
		 
			// insert into users(username,password) values(4 ,'sai','1452')
			
		  statement.executeUpdate("insert into users(username,password) values (' "+ userName + " ' ,' " +userPassword+" ')");
	
		  System.out.println("User Signed up");
	}


}
