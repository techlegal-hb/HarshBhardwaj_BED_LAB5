package com.employeeManagementSystem.service.impl;

import com.employeeManagementSystem.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
