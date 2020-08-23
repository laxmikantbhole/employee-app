package com.devmode.employeeapp.service;

import java.util.List;
import java.util.Map;

import com.devmode.employeeapp.exception.ResourceNotFoundException;
import com.devmode.employeeapp.model.Employee;

public interface IEmployeeService {

	Employee saveEmployee(Employee employee);

	Employee getEmployee(Long employeeId) throws ResourceNotFoundException;

	List<Employee> getEmployeeList();

	Employee updateEmployee(Long employeeId, Employee employeeDetails) throws ResourceNotFoundException;

	Map<String, Boolean> deleteEmployee(Long employeeId) throws ResourceNotFoundException;

}
