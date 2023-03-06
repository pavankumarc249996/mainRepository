package com.pavan.model;

public class Address {
	
	private String stName;
	private String place;
	private long pin;
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [stName=" + stName + ", place=" + place + ", pin=" + pin + "]";
	}
	
	

}
