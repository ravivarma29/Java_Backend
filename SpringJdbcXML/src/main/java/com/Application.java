 package com;

import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.config.Config;
import com.model.Address;
import com.model.User;

public class Application {
	public static void main(String[] args) {
		
		
		  ApplicationContext ctx = new AnnotationConfigApplicationContext("beans.xml");
	      JdbcTemplate template = ctx.getBean("template",JdbcTemplate.class);
	  
	      template .queryForObject("select * from employees where emp_id=2", new RowMapper<Employee>() {
			
			@Override
			public Employee mapRow(ResultSet rs .int RowNum) throws SQLException {
			
				return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		});
	      System.out.Printn(Employee);
	      
	      
	      
	      
//	      template.update("insert into employees values(?,?,?)",1,"ravi",10000);
	      
//	      template.update("update employees set salary=? where id=?",11000,6);

	      
	      template.update("delete from employees where emp_id=?",6);
	       System.out.println("inserted");
		
		
		
		
	}

}
