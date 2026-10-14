package com.storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.util.DatabaseConnection;

public class JdbcStoredProcedures {

	public static void main(String[] args) throws SQLException {
		
//		dynamicInsert(connection);
//		getPrice(connection);

	Connection connection = DatabaseConnection.getConnection();
	
	CallableStatement statement = connection.prepareCall("{call doublePrice(?)}");
	
	statement.setInt(1, 125);
	statement.registerOutParameter(1, Types.INTEGER);
	
	statement.execute();
	int doubleValue = statement.getInt(1);
	System.out.println(doubleValue);

	}


	private static void getPrice(Connection connection) throws SQLException {
		CallableStatement statement = connection.prepareCall("{call getProductsByPrice(?,?)}");
		
		statement.setInt(1, 125);
		statement.registerOutParameter(2, Types.INTEGER);
		statement.execute();
		
		int count = statement.getInt(2);
		System.out.println(count);
		
		System.out.println("Data displayed");
	}


	private static void dynamicInsert(Connection connection) throws SQLException {
		CallableStatement callableStatement = connection.prepareCall("{call insertProduct(?,?,?)}");
		
		callableStatement.setInt(1, 6);
		callableStatement.setString(2, "Table");
		callableStatement.setInt(3, 8000);
		
		callableStatement.execute();
	}
}
