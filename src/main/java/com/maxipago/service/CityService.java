package com.maxipago.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxipago.dao.CityDAO;
import com.maxipago.dao.CityRepository;
import com.maxipago.model.City;
import com.maxipago.model.Combination;

@Service
public class CityService {

	@Autowired
	private CityDAO repositoryJDBC;

	@Autowired
	private CityRepository repository;

	public List<City> findAllJDBC() throws SQLException {
		return repositoryJDBC.findAll();
	}

	public List<Combination> getCombinations(String parametro) throws SQLException {

		List<City> cities = repository.findAll();
		// List<City> cities = repositoryJDBC.findAll();
		List<Combination> combinations = new ArrayList<>();
		// cities.forEach(s -> System.out.println(s));

		for (City city : cities) {

			Iterator<City> iterator = cities.iterator();

			while (iterator.hasNext()) {
				City next = iterator.next();
				if (!city.equals(next)) {
					combinations.add(City.distance(city, next, parametro));
				}
			}
		}
		return combinations;
	}

}
