 package com.sm.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.sm.controller", "com.sm.DAO","com.sm.service"})

public class StudentAppConfig {
	//need a view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("/WEB-INF/view/");
		
		
		return viewResolver;
	}
	@Bean
	JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSouce());
		return jdbcTemplate;
	}
	@Bean
	DataSource dataSouce() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setUsername("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/baranwal");
		dataSource.setPassword("564542");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return dataSource;
	}
}
