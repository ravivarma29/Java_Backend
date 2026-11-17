package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@Bean("template")
	public JdbcTemplate jdbcTemplate()
	{
		DataSource dataSource = dataSource(); // method
		return new JdbcTemplate(dataSource); 
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("root");
		dataSource.setPassword("Ravi$2026");
		
		return dataSource;
	}
	
}
