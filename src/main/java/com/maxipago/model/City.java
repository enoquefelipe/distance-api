package com.maxipago.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City implements Comparable<City> {

	@Id
	private Long id;
	private String name;
	private String latitude;
	private String longitude;

	// Getters and Setters

	@Override
	public String toString() {
		return "City: " + name;
	}

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

	public static void main(String[] args) throws java.lang.Exception {

		// System.out.println(distance(-23.5505199, -46.63330939999997, -22.9068467, -43.17289649999998, "M") + "
		// Miles\n");
		// System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n");

	}

	// public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
	public static Combination distance(City origen, City destino, String unit) {

		Double longitudeOrigem = new Double(origen.getLongitude());
		Double latitudeOrigem = new Double(origen.getLatitude());

		Double longitudeDestino = new Double(destino.getLongitude());
		Double latitudeDestino = new Double(destino.getLatitude());

		double theta = longitudeOrigem - longitudeDestino;
		double dist = Math.sin(deg2rad(latitudeOrigem)) * Math.sin(deg2rad(latitudeDestino))
				+ Math.cos(deg2rad(latitudeOrigem)) * Math.cos(deg2rad(latitudeDestino)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		}

		Combination comb = new Combination();
		comb.setOriginCity(origen.getName());
		comb.setDestinationCity(destino.getName());
		comb.setDistance(dist);

		return comb;
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts decimal degrees to radians : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts radians to decimal degrees : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

	@Override
	public int compareTo(City city) {
		return 0;
	}

}
