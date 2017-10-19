package com.maxipago.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	private Long id;
	private String name;
	private String latitude;
	private String longitude;

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setName(String name) {
		this.name = name;
	}

}
