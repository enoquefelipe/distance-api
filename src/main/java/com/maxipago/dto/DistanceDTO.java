package com.maxipago.dto;

import java.util.List;

import com.maxipago.model.Combination;

public class DistanceDTO {

	private int records;
	private List<Combination> combinations;

	// Getters and Setters

	public List<Combination> getCombinations() {
		return combinations;
	}

	public void setCombinations(List<Combination> combinations) {
		this.combinations = combinations;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

}
