package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.util.Constants;
import com.util.DbConnection;

public class EmployeeDAO {
	
	public List<Employee> getAllEmployees() throws ClassNotFoundException {
		
		List<Employee> empList = new ArrayList<Employee>();
		try {
			Connection connection = DbConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SELECT_EMPLOYEES);
			ResultSet resultSet = statement.executeQuery();
			
			
			
			while(resultSet.next()) {
				
				int id=resultSet.getInt("empId");
				String name = resultSet.getString("empname");
				String email = resultSet.getString("email");
				String phoneNum = resultSet.getString("phoneNum");
				int salary = resultSet.getInt("salary");
				boolean isActive = resultSet.getBoolean("isActive");
				
				Employee emp = new Employee(id, name, email, phoneNum, salary, isActive);
				empList.add(emp);
				 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
		
	}
	
	
	public void saveEmployee(Employee emp)
	{
		Connection connection = null;
		 try {
			 connection = DbConnection.getConnection();
			 PreparedStatement statement = connection.prepareStatement(Constants.INSERT_EMPLOYEE);
			 
			 statement.setString(1, emp.getName());
			 statement.setString(2, emp.getEmail());
			 statement.setString(3, emp.getPhoneNum());
			 statement.setInt(4, emp.getSalary());
			 
			 
			 statement.executeUpdate();
			 
			 
		 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		 } catch (SQLException e) {
			e.printStackTrace();
		 }
	}

}
