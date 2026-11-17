 package com;

import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.config.Config;
import com.entity.Employee;


public class Application {
	public static void main(String[] args) {
		
		
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	      JdbcTemplate template = ctx.getBean("template", JdbcTemplate.class);
	  
	     List<Employee> employees= template.query("select * from employee where emp_id= ?", 
	    		 (rs,rowNum)-> new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)),3);
			
			
	      System.out.println(employees);
	      
	      
	      
	      
//	      template.update("insert into employees values(?,?,?)",1,"ravi",10000);
	      
//	      template.update("update employees set salary=? where id=?",11000,6);

	      
//	      template.update("delete from employees where emp_id=?",6);
//	       System.out.println("inserted");
//		
		
		
		
	}

}
