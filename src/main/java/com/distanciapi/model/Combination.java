package com.distanciapi.model;

/**
 * 
 * @author enoque.felipe
 *
 */
public class Combination {

	private String originCity;
	
	private String destinationCity;
	
	private Double distance;

	/* Getters and Setters */

	public String getDestinationCity() {
		return destinationCity;
	}

	public Double getDistance() {
		return distance;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

}
