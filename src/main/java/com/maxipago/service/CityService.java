package com.maxipago.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxipago.dao.CityDAO;
import com.maxipago.model.City;
import com.maxipago.model.Combination;

/**
 * 
 * @author enoque.felipe
 *
 */
@Service
public class CityService {

	@Autowired
	private CityDAO repository;

	/**
	 * 
	 * 
	 * @return
	 * @throws SQLException
	 * 
	 */
	public List<City> findAllJDBC() throws SQLException {
		return repository.findAll();
	}

	/**
	 * 
	 * Combination method
	 * 
	 * This routine tests all combinations of items on the list, 
	 * without repetitions and ambiguity between items.
	 * 
	 * @param unit
	 * @return
	 * @throws SQLException
	 * 
	 */
	public List<Combination> getCombinations(String unit) throws SQLException {

		List<City> cities = repository.findAll();

		List<Combination> combinations = new ArrayList<Combination>();

		for (City city : cities) {

			Iterator<City> iterator = cities.iterator();

			while (iterator.hasNext()) {
				City next = iterator.next();
				if (!city.equals(next)) {
					combinations.add(City.distance(city, next, unit));
				}
			}
		}
		
		return combinations;
		
	}

}
