package com.devmode.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmode.employeeapp.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}

