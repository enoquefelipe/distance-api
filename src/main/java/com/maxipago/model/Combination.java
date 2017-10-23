package com.maxipago.model;

public class Combination {

	private String originCity;
	private String destinationCity;
	private Double distance;

	// Getters and Setters

	@Override
	public String toString() {
		return "Origin: " + originCity + ", Destination: " + destinationCity + ", Distance: " + distance;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

}
