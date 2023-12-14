package com.srccodes.example;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    @Override
    public Employee getEmployeeById(int employeeId) {
        Employee employee = null;
		// Implementation to retrieve an employee by ID from the database
        // ...
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        // Implementation to retrieve all employees from the database
        // ...
        return getAllEmployees(); 
    }

    @Override
    public void addEmployee(Employee employee) {
        // Implementation to add an employee to the database
        // ...
    }

    @Override
    public void updateEmployee(Employee employee) {
        // Implementation to update an employee in the database
        // ...
    }

    @Override
    public void removeEmployee(int employeeId) {
        // Implementation to remove an employee from the database
        // ...
    } 
}