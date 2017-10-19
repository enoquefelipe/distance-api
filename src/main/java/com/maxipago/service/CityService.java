package com.maxipago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxipago.model.City;
import com.maxipago.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;

	public void deleteById(String id) {
		repository.delete(id);
	}

	public Iterable<City> findAll() {
		return repository.findAll();
	}

	public City findById(String id) {
		return repository.findOne(id);
	}

	public void save(City city) {
		repository.save(city);
	}

}
