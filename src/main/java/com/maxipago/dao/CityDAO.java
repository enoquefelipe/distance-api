package com.maxipago.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.maxipago.model.City;
import com.maxipago.util.ConnectionFactory;

/**
 * 
 * @author enoque.felipe
 *
 */
@Repository
public class CityDAO {

	private Connection connection;
	private PreparedStatement stmt;
	private static final String QUERY_FIND_ALL_CITIES = "SELECT * FROM city";

	public List<City> findAll() throws SQLException {

		connection = new ConnectionFactory().getConnection();
		stmt = connection.prepareStatement(QUERY_FIND_ALL_CITIES);
		ResultSet rs = stmt.executeQuery();

		List<City> cities = new ArrayList<City>();

		while (rs.next()) {

			City city = new City();
			city.setId(rs.getLong("id"));
			city.setName(rs.getString("name"));
			city.setLatitude(rs.getString("latitude"));
			city.setLongitude(rs.getString("longitude"));
			cities.add(city);
		}

		rs.close();
		stmt.close();
		connection.close();

		return cities;

	}

}
