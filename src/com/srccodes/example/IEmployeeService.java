package com.srccodes.example;

import java.util.List;
//import entity.Employee; 
public interface IEmployeeService {

	 Employee getEmployeeById(int employeeId);
	    List<Employee> getAllEmployees();
	    void addEmployee(Employee employee);
	    void updateEmployee(Employee employee);
	    void removeEmployee(int employeeId);
	}


