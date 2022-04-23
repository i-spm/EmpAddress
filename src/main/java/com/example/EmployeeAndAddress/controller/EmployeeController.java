package com.example.EmployeeAndAddress.controller;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeAndAddress.model.Employee;
import com.example.EmployeeAndAddress.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/createEmployee")
	public Employee save(@RequestBody Employee employee) {
		System.out.println("employee :: " +employee);
		// System.out.println(employee);
		
		return employeeRepository.save(employee);
	}

}
