package com.maxipago.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String DATABASE = "jdbc:mysql://localhost/db_maxipago?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(DATABASE, USER, PASS);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
