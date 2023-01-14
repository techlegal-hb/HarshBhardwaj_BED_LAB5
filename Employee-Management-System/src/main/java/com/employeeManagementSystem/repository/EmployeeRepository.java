package com.employeeManagementSystem.repository;

import com.employeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {

    public List<Employee> findAll();

    public Employee save(Employee employee);

    public Employee findById(long id);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}