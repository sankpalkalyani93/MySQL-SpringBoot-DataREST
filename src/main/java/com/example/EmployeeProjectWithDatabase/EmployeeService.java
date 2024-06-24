package com.example.EmployeeProjectWithDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeRepository empRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository empRepository) {
		this.empRepository = empRepository;
	}
	
	public Employee createEmployee(Employee employee) {
		return empRepository.save(employee);
	}
}
