package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {
	public static void main(String[] args) throws SQLException {
		
//		dmlOperations();
		
		System.out.println("Starting Driver Registration");

		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// url , username , password

			String url = "jdbc:mysql://localhost:3306/items";
			String username = "root";
			String password = "Ravi$2026";

			connection = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Success");

			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from products");
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				
				System.out.println(id +" "+ name +" " + price);
			}
						
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			connection.close();
			statement.close();
		}
		
	}

	private static void dmlOperations() throws SQLException {
		System.out.println("Starting Driver Registration");

		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// url , username , password

			String url = "jdbc:mysql://localhost:3306/items";
			String username = "root";
			String password = "Ravi$2026";

			connection = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Success");

			statement = connection.createStatement();
			statement.executeUpdate("insert into products values (3,'Bottle',150)");
			statement.executeUpdate("update products set price=125 where p_id=3");
			statement.executeUpdate("delete from products where p_id=4");
			System.out.println("Data opertions done");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			connection.close();
			statement.close();
		}
	}

}
