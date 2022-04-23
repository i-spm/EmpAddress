package com.example.EmployeeAndAddress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeAndAddress.model.Address;
import com.example.EmployeeAndAddress.repository.AddressRepository;


@RestController
public class AddressController {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address save(@RequestBody Address address) {
		
		return addressRepository.save(address);
		
	}

}
