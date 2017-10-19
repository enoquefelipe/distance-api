package com.maxipago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maxipago.model.City;
import com.maxipago.service.CityService;

@RestController
@RequestMapping(value = "/api")
public class CityController {

	@Autowired
	private CityService service;

	@RequestMapping(value = "/cities", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<List<City>> listaCitys() {
		return new ResponseEntity<List<City>>((List<City>) service.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/cities/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<City> getById(@PathVariable("id") String id) {
		City city = service.findById(id);
		return new ResponseEntity<City>(city, HttpStatus.OK);
	}

	@RequestMapping(value = "/cities", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public HttpStatus cadastraCities(@RequestBody List<City> cities) {
		for (City city : cities) {
			service.save(city);
		}
		return (HttpStatus.OK);
	}

	@RequestMapping(value = "/cities/{id}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public HttpStatus deleteById(@PathVariable("id") String id) {
		service.deleteById(id);
		return HttpStatus.OK;
	}

}
