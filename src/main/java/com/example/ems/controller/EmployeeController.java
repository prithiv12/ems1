package com.example.ems.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ems.entity.Employee;
import com.example.ems.service.EmployeeServiceImpl;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl eservice;
	
	@PostMapping(value = "/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(eservice.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/allEmployees")
	public ResponseEntity<List<Employee>> allEmployees()
	{
		return new ResponseEntity<List<Employee>>(eservice.getAllEmployee(),HttpStatus.OK);
	}
	
	@GetMapping(value="/{eid}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Integer eid)
	{
		return new ResponseEntity<Optional<Employee>>(eservice.getEmployeeById(eid),HttpStatus.OK);
}
}
