package com.maxipago.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionFactory {

	private static final String DATABASE = "jdbc:mysql://localhost/db_maxipago?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";

	final static Logger logger = Logger.getLogger(ConnectionFactory.class);

	public Connection getConnection() throws SQLException {
		try {
			return DriverManager.getConnection(DATABASE, USER, PASS);
		} catch (SQLException e) {
			logger.error("Erro ao conectar com o banco de dados");
			throw new SQLException(e);
		}
	}

}
