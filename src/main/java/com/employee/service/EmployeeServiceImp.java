package com.employee.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService{
@Autowired
private EmployeeRepo emprepo;
	@Override
	public Employee createEmployee(Employee emp) {
		Employee e=emprepo.save(emp);
		return e;
	}

	@Override
	public void deleteEmployee(Integer empid) {
		emprepo.deleteById(empid);
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=emprepo.findAll();
		return list;
	}

	
	@Override
	public Employee getOneEmployee(Integer empid) {
		return emprepo.findById(empid).get();
		
	}

	@Override
	public Employee updateEmployee(Integer empid, Employee emp) {
		Employee oldemps=emprepo.findById(empid).get();
		oldemps.setSalary(emp.getSalary());
		oldemps.setAddress(emp.getAddress());
		oldemps.setPhno(emp.getPhno());
		oldemps.setEmail(emp.getEmail());
		return emprepo.save(oldemps);
	}

	

}
