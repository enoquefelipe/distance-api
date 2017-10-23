package com.maxipago.dto;

import java.util.List;

import com.maxipago.model.Combination;

public class DistanceDTO {

	private int records;
	private List<Combination> combinations;
	private String message;

	// Getters and Setters

	public List<Combination> getCombinations() {
		return combinations;
	}

	public String getMessage() {
		return message;
	}

	public int getRecords() {
		return records;
	}

	public void setCombinations(List<Combination> combinations) {
		this.combinations = combinations;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setRecords(int records) {
		this.records = records;
	}

}
