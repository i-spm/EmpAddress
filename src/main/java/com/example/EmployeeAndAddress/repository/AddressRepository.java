package com.example.EmployeeAndAddress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeAndAddress.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	
	

}
