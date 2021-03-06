package com.distanciapi.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.distanciapi.dto.DistanceDTO;
import com.distanciapi.model.Combination;
import com.distanciapi.service.CityService;

/**
 * 
 * @author enoque.felipe
 *
 */
@RestController
@RequestMapping(value = "/api")
public class CityController {

	private final static Logger logger = Logger.getLogger(CityController.class);

	@Autowired
	private CityService service;

	/**
	 * 
	 * 
	 * @param unit
	 * @return
	 * 
	 */
	@RequestMapping(value = "/cities", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<DistanceDTO> listaCitys(@RequestParam("unit") String unit) {

		DistanceDTO dto = new DistanceDTO();

		try {
			List<Combination> combinations = service.getCombinations(unit);
			dto.setRecords(combinations.size());
			dto.setCombinations(combinations);
			dto.setMessage("Success");
		} catch (SQLException e) {
			logger.error("Error" + e.getMessage());
			dto.setMessage("Failed to get results");
		}

		return new ResponseEntity<DistanceDTO>(dto, HttpStatus.OK);

	}

}
