package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
       public Employee createEmployee(Employee emp);
       public void deleteEmployee(Integer empid);
       public List<Employee> getAllEmployees();
       public Employee getOneEmployee(Integer empid);
       public Employee updateEmployee(Integer empid,Employee emp);
}
