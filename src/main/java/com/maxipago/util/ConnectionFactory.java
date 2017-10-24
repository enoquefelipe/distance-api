package com.maxipago.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author enoque.felipe
 *
 */
public class ConnectionFactory {

	@Value("${spring.datasource.url}")
	private String url = "jdbc:mysql://localhost:3306/db_maxipago?useTimezone=true&serverTimezone=UTC";

	@Value("${spring.datasource.username}")
	private String username = "root";

	@Value("${spring.datasource.password}")
	private String password = "";

	final static Logger logger = Logger.getLogger(ConnectionFactory.class);

	public Connection getConnection() throws SQLException {

		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			logger.error("Error connecting to database");
			throw new SQLException(e);
		}
	}

}
