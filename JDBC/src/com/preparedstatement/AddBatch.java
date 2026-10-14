package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DatabaseConnection;

public class AddBatch {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		
		try {
		 connection = DatabaseConnection.getConnection();
		connection.setAutoCommit(false);
		
		String query ="insert into users(username,password) values(?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1,"us1");
		statement.setString(2, "sgkja");
		
		statement.addBatch();
		
		statement.setString(1,"us2");
		statement.setString(2, "ehff");
		
		statement.addBatch();
		
		statement.setString(1,"us3");
		statement.setString(2, "egvc");
		
		statement.addBatch();
		
		statement.setString(1,"us4");
		statement.setString(2, "wefgv");
		
		statement.addBatch();
		
		statement.executeBatch();
		connection.commit();
		
		System.out.println("inserted everyone");
		}catch(Exception e) {
			connection.rollback();
		}
	}

}
