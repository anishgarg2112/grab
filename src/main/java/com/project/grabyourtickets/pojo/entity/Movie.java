package com.project.grabyourtickets.pojo.entity;

public class Movie {

	int movieId;
	String movieName;
	String description;
	String duration;
	String releaseDate;
	String pictureURL;
	String[] language;
	String[] genre;

	public Movie() {

	}

	public Movie(int movieId, String movieName, String description, String duration, String releaseDate,
			String pictureURL, String[] language, String[] genre) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.description = description;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.pictureURL = pictureURL;
		this.language = language;
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public String[] getGenre() {
		return genre;
	}

	public void setGenre(String[] genre) {
		this.genre = genre;
	}

}
