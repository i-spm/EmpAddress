package com.example.EmployeeAndAddress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeAndAddress.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	

}
