package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.hibernate.SessionFactory;

@Configuration
@ComponentScan(basePackages = "	com")
@EnableTransactionManagement
public class Config {

	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("root");
		dataSource.setPassword("Ravi$2026");
		
		return dataSource;
	}
	
	@Bean
	public 	LocalSessionFactoryBean sessionFactoryBean()
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com");
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		return sessionFactoryBean;
	}
	
	@Bean
	public Properties hibernateProperties() {
		Properties props = new Properties();
		props.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect" );
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto","update");
		return props;
		
	}
	
	@Bean
	public HibernateTransactionManager  hibernateTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager tm = new HibernateTransactionManager();
		tm.setSessionFactory(sessionFactory);
		return tm;
	}
}
