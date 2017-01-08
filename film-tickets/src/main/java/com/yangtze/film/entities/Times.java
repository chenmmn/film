package com.yangtze.film.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Times extends BaseEntity {

	@Id
	@GeneratedValue
	private long timesId;
	
	private String startTime;
	
	private String endEime;
	
	private int ticketSum;
	
	private int ticketBalance;

	public long getTimesId() {
		return timesId;
	}

	public void setTimesId(long timesId) {
		this.timesId = timesId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndEime() {
		return endEime;
	}

	public void setEndEime(String endEime) {
		this.endEime = endEime;
	}

	public int getTicketSum() {
		return ticketSum;
	}

	public void setTicketSum(int ticketSum) {
		this.ticketSum = ticketSum;
	}

	public int getTicketBalance() {
		return ticketBalance;
	}

	public void setTicketBalance(int ticketBalance) {
		this.ticketBalance = ticketBalance;
	}
	
}
