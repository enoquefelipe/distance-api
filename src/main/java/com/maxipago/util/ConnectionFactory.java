package com.maxipago.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

public class ConnectionFactory {

	@Value("${spring.datasource.url}")
	private String url = "jdbc:mysql://192.168.15.5:3306/db_maxipago?useTimezone=true&serverTimezone=UTC&useSSL=false";

	@Value("${spring.datasource.username}")
	private String username = "root";

	@Value("${spring.datasource.password}")
	private String password = "";

	final static Logger logger = Logger.getLogger(ConnectionFactory.class);

	public Connection getConnection() throws SQLException {

		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			logger.error("Erro ao conectar com o banco de dados");
			throw new SQLException(e);
		}
	}

}
