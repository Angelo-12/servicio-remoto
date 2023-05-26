package com.curso.msventa.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    
	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create()
				.driverClassName("org.postgresql.Driver")
		          .url("jdbc:postgresql://localhost:5432/productos")
		          .username("postgres")
		          .password("Barcelona17")
		          .build();	
	}
}
