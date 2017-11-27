package com.distanciapi.util;

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
	
	private final static Logger logger = Logger.getLogger(ConnectionFactory.class);

	@Value("${jdbc.datasource.url}")
	private String url;

	@Value("${jdbc.datasource.username}")
	private String username;

	@Value("${jdbc.datasource.password}")
	private String password;

	/**
	 * 
	 * Connection Factory method for JDBC Database Connection
	 * @return
	 * @throws SQLException
	 * 
	 */
	public Connection getConnection() throws SQLException {

		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			logger.error("Error connecting to database");
			throw new SQLException(e);
		}
	}

}
