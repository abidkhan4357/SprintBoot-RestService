package com.qa.restservice;

import java.util.ArrayList;
import java.util.List;

public class AddressRepository {

	 private List<GenerateAddress> addressList;
	 
	 public List<GenerateAddress> getAddressList()
	 {
		 if(addressList == null) {
			 addressList = new ArrayList<>();
		 }
		 
		 return addressList;
	 }
	 
	 public void setAddressList(List<GenerateAddress> addressList)
	 {
		 this.addressList = addressList;
	 }
	 
	
}
