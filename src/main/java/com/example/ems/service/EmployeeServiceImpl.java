package com.example.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.entity.Employee;
import com.example.ems.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository erepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return erepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return erepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer eid) {
		return erepo.findById(eid);
	}

}
