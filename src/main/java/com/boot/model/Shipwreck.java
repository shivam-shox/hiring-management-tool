package com.boot.model;

public class Shipwreck {
	Long id;
	String name;
	String role;
	String questions;
	Integer depth;
	String scheduledAt;
	Double longitude;
	Integer yearDiscovered;

	public Shipwreck() { }

	public Shipwreck(Long id, String name, String role, String questions, Integer depth, String scheduledAt, Double longitude, Integer yearDiscovered) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.questions = questions;
		this.depth = depth;
		this.scheduledAt = scheduledAt;
		this.longitude = longitude;
		this.yearDiscovered = yearDiscovered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public String getScheduledAt() {
		return scheduledAt;
	}

	public void setScheduledAt(String scheduledAt) {
		this.scheduledAt = scheduledAt;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYearDiscovered() {
		return yearDiscovered;
	}

	public void setYearDiscovered(Integer yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}
}
