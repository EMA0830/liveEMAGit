package com.miniproject.model;

public class Route {
//  restricting access by using private fields
//  private fields with getter and setters are called properties.
	private String from, to, travelTime, airfare;
	private int distance;

	public Route() {

	}

	public Route(String from, String to, int distance, String travelTime, String airfare) {
		this.from = from;
		this.to = to;
		this.travelTime = travelTime;
		this.distance = distance;
		this.airfare = airfare;
	}

	// syxsci : airfare (getAirfare()) : returns airfare
	public String getAirfare() {
		// add logic
		return airfare;
	}

	public int getDistance() {
		return distance;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getTravelTime() {
		return travelTime;
	}

	// syxsci : airfare (setAirfare(String airfare)) : returns void
	public void setAirfare(String airfare) {
		// logic
		this.airfare = airfare;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	@Override
	public String toString() {
		if (to.length() > 6)
			return from + "\t\t" + to + "\t" + distance + "\t\t" + travelTime + "\t\t" + airfare;
		else if (from.length() < 7)
			return from + "\t\t" + to + "\t\t" + distance + "\t\t" + travelTime + "\t\t" + airfare;
		else
			return from + "\t" + to + "\t\t" + distance + "\t\t" + travelTime + "\t\t" + airfare;

	}
}
