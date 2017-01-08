package com.yangtze.film.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class BookingTicket extends BaseEntity {
	@Id
	@GeneratedValue
	private long bookingId;

	private byte payStatus;

	private byte takeStatus;

	private Date bookingTime;
	
	private String account;

	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER)
	@JoinColumn(name="timesId")
	private Times times;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public byte getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(byte payStatus) {
		this.payStatus = payStatus;
	}

	public byte getTakeStatus() {
		return takeStatus;
	}

	public void setTakeStatus(byte takeStatus) {
		this.takeStatus = takeStatus;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public Times getTimes() {
		return times;
	}

	public void setTimes(Times times) {
		this.times = times;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
