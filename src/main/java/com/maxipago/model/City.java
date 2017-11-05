package com.maxipago.model;

/**
 * 
 * @author enoque.felipe
 *
 */
public class City {

	private Long id;
	
	private String name;
	
	private String latitude;
	
	private String longitude;

	/* Getters and Setters */

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

	/* end Getters and Setters */

	/**
	 * This routine calculates the distance between two points (given the latitude/longitude of those points). 
	 * It is being used to calculate the distance between two locations using GeoDataSource (TM) prodducts
	 * 
	 * @param origen
	 * @param destino
	 * @param unit
	 * @return
	 */
	public static Combination distance(City origen, City destino, String unit) {

		double longitudeOrigem = new Double(origen.getLongitude());
		double latitudeOrigem = new Double(origen.getLatitude());

		double longitudeDestino = new Double(destino.getLongitude());
		double latitudeDestino = new Double(destino.getLatitude());

		double theta = longitudeOrigem - longitudeDestino;
		double dist = Math.sin(deg2rad(latitudeOrigem)) * Math.sin(deg2rad(latitudeDestino))
				+ Math.cos(deg2rad(latitudeOrigem)) * Math.cos(deg2rad(latitudeDestino)) * Math.cos(deg2rad(theta));

		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;

		if (unit.equalsIgnoreCase("K")) {
			dist = dist * 1.609344;
		}

		Combination comb = new Combination();
		comb.setOriginCity(origen.getName());
		comb.setDestinationCity(destino.getName());
		comb.setDistance(dist);

		return comb;
	}

	/* This function converts decimal degrees to radians */
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	/* This function converts radians to decimal degrees */
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

}
