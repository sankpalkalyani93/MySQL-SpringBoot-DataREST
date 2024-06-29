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
	
	public Employee updateEmployee(Integer id, Employee employeeDetails) {
		Optional<Employee> employee = empRepository.findById(id);
		if(employee.isPresent()) {
			Employee updatedEmployee = employee.get();
			updatedEmployee.setEmpname(employeeDetails.getEmpname());
			updatedEmployee.setEmpsalary(employeeDetails.getEmpsalary());
			updatedEmployee.setEmpcompmany(employeeDetails.getEmpcompany());
			return empRepository.save(updatedEmployee);
		}
		return null;
	}
}
