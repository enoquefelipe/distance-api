package com.maxipago.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maxipago.dto.DistanceDTO;
import com.maxipago.model.Combination;
import com.maxipago.service.CityService;

@RestController
@RequestMapping(value = "/api")
public class CityController {

	@Autowired
	private CityService service;

	@RequestMapping(value = "/cities", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<DistanceDTO> listaCitys() {

		DistanceDTO dto = new DistanceDTO();

		try {
			List<Combination> combinations = service.getCombinations();

			dto.setRecords(combinations.size());
			dto.setCombinations(combinations);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<DistanceDTO>(dto, HttpStatus.OK);

	}

}
