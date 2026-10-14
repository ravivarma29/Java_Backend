package com.preparedstatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.DatabaseConnection;

public class PreparedState {
	public static void main(String[] args) throws SQLException {
		
	Connection connection = DatabaseConnection.getConnection();
	
	String insertQuery = "insert into users values(?,?,?)";
	java.sql.PreparedStatement statement = connection.prepareStatement(insertQuery);
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter userID");
	int id = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter username :");
	String username = sc.nextLine();
	
	System.out.println("Enter password :");
	String password = sc.nextLine();
	
	statement.setInt(1, id);
	statement.setString(2, username);
	statement.setString(3, password);
	
	
	statement.executeUpdate();
	
	}
//	while(rs.next())
//	{
//		System.out.println(rs.getInt(1) +" " +  rs.getString(2) + " " +rs.getString(3));
//	}
//	
//	}
}
