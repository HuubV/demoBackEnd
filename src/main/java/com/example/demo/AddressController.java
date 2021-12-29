package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
public class AddressController {
	
	@Autowired
	private AddressService service;
	
	@RequestMapping(value = "/addressen")
	public List<Address> vindaddress() {
		return service.vindAlleAddresses();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/maakaddressaan")
	public Address maakAddressAan(@RequestBody Address address) {
		return service.maakAddressAan(address);
	}
}
