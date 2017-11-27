package com.distanciapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.distanciapi.util.ConnectionFactory;

/**
 * 
 * @author enoque.felipe
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.distanciapi"})
@PropertySource({"classpath:jdbc.properties"})
public class Application extends SpringBootServletInitializer {

	/**
	 * 
	 * Main method for run Spring Boot Application
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * ConnectionFactory Bean
	 * @return
	 */
	@Bean
	public ConnectionFactory connectionFactory(){
		return new ConnectionFactory();
	}

}
