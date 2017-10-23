package com.maxipago.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxipago.dao.CityDAO;
import com.maxipago.model.City;
import com.maxipago.model.Combination;

@Service
public class CityService {

	@Autowired
	private CityDAO repository;

	public List<City> findAllJDBC() throws SQLException {
		return repository.findAll();
	}

	public List<Combination> getCombinations() throws SQLException {

		List<Combination> combinations = new ArrayList<Combination>();
		List<City> cities = repository.findAll();

		for (City city : cities) {
			System.out.println(city);
		}

		Combination comb = new Combination();
		comb.setDestinationCity("Rio de Janeiro");
		comb.setOriginCity("São Paulo");
		comb.setDistance("350");
		combinations.add(comb);

		return combinations;

	}

	public void calculaDistancia(double x1, double x2, double y1, double y2) {

		double distancia1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(distancia1 / 1000);

		double distancia2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println(distancia2 / 1000);

	}

}
