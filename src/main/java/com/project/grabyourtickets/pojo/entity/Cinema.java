package com.project.grabyourtickets.pojo.entity;

public class Cinema {

	int cinemaId;
	String cinemaName;
	int noOfScreens;

	public Cinema() {

	}

	public Cinema(int cinemaId, String cinemaName, int noOfScreens) {
		this.cinemaId = cinemaId;
		this.cinemaName = cinemaName;
		this.noOfScreens = noOfScreens;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

}
