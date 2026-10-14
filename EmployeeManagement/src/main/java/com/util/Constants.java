package com.util;

public class Constants {
	
		public static final String URL = "jdbc:mysql://localhost:3306/webapps";
		public static final String DB_USER_NAME = "root";
		public static final String DB_PASSWORD = "Ravi$2026";

		public static final String INSERT_ADMIN ="insert into admins(username,password) values(?,?)";
		public static final String SELECT_ADMIN="select * from admins where  usename=? and passwords =? ";
		public static final String SELECT_EMPLOYEES="select * from employees";
		public static final String INSERT_EMPLOYEE ="insert into employees(name, email,phoneNum,salary) values(?,?,?,?)";
}
