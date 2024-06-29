package com.example.EmployeeProjectWithDatabase;

import java.util.List;
import java.util.Optional;

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
	
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Integer id) {
		return empRepository.findById(id);
	}
}
