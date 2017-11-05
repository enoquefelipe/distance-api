package com.maxipago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * 
 * @author enoque.felipe
 *
 */
@SpringBootApplication
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

}
