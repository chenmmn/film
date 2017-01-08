package com.yangtze.film.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Film extends BaseEntity {

	@Id
	@GeneratedValue
	private long filmId;
	
	private String filmName;
	
	private String showDate;
	
	private String finishDate;
	
	private double price;
	
	private String description;
	
	private byte status;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="timesId")
	private List<Times> timesList;

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<Times> getTimesList() {
		return timesList;
	}

	public void setTimesList(List<Times> timesList) {
		this.timesList = timesList;
	}

}
