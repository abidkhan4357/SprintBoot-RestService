package com.qa.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/address")
public class AddressController {

	@Autowired
	private AddressDTO addressDTO;
	
	  @GetMapping(path = "/", produces = "application/json")
	  
	  public AddressRepository getAddress()
	  {
		  return addressDTO.getAllAddress();
	  }
	  
	  
	 
	
	
	
}
