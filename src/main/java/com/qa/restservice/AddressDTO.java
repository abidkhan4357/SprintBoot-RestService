package com.qa.restservice;
import java.util.Locale;

import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;

@Repository
public class AddressDTO {

	static Faker faker = new Faker(new Locale("en-US"));
	private static AddressRepository list = new AddressRepository();

	static String streetAddress = faker.address().buildingNumber();
	static String postalCode = faker.address().zipCode();
	static String city = faker.address().city();
	static String state = faker.address().state();
	static String country = faker.address().countryCode();
	
	
	static
	{
		list.getAddressList().add(new GenerateAddress(streetAddress, postalCode, city, state, country));
		
	}
	
	  public AddressRepository getAllAddress() 
	    { 
	  
	        return list; 
	    } 
	
	
	
}
