package com.dk.Lib.Service;

import com.dk.Lib.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Integer eId);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Integer eId);

}
