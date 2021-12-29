package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	private IAddressRepository repository;
	
	public List<Address> vindAlleAddresses() {
		List<Address> address = repository.findAll();
		
		return address;
	}
	
	public Address maakAddressAan(Address address) {
		return repository.save(address);
	}
	
}
