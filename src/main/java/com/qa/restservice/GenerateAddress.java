package com.qa.restservice;

public class GenerateAddress {
	
	private String street;
	private String postalCode;
	private String City;
	private String state;
	private String country;

	
	public GenerateAddress(String street, String postalCode, String City, String state, String country) {
		
		super(); 
		this.street = street;
		this.postalCode = postalCode;
		this.City = City;
		this.state = state;
		this.country = country;
		
		
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
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
