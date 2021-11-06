package com.example.ems.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import com.example.ems.entity.Employee;

public interface IEmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	public Optional<Employee> getEmployeeById(Integer eid);
}