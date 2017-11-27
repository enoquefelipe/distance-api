package com.distanciapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distanciapi.model.City;
import com.distanciapi.util.ConnectionFactory;

/**
 * 
 * @author enoque.felipe
 *
 */
@Repository
public class CityDAO {

	@Autowired
	private ConnectionFactory connectionFactory;
	
	private Connection connection;
	
	private PreparedStatement stmt;
	
	private static final String QUERY_FIND_ALL_CITIES = "SELECT * FROM city";

	/**
	 * 
	 * 
	 * @return
	 * @throws SQLException
	 * 
	 */
	public List<City> findAll() throws SQLException {

		connection = connectionFactory.getConnection();
		stmt = connection.prepareStatement(QUERY_FIND_ALL_CITIES);
		ResultSet rs = stmt.executeQuery();

		List<City> cities = new ArrayList<>();

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
