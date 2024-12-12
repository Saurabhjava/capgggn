package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class CorAddress implements IAddress {
	private String city;
	private String country;
	private long zip;
	public CorAddress() {
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	
	

}
