package com.boot.model;

public class Shipwreck {
	Long id;
	String name;
	String role;
	String questions;
	String feedback;
	String scheduledAt;
	Double longitude;
	String rating;

	public Shipwreck() { }

	public Shipwreck(Long id, String name, String role, String questions, String feedback, String scheduledAt, Double longitude, String rating) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.questions = questions;
		this.feedback = feedback;
		this.scheduledAt = scheduledAt;
		this.longitude = longitude;
		this.rating = rating;
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

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}
