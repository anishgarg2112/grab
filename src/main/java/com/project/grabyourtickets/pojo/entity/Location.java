package com.project.grabyourtickets.pojo.entity;

public class Location {

	int cinemaId;
	String streetAddress;
	int zipcode;
	String city;
	String state;
	String country;

	public Location() {

	}

	public Location(int cinemaId, String streetAddress, int zipcode, String city, String state, String country) {
		this.cinemaId = cinemaId;
		this.streetAddress = streetAddress;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
