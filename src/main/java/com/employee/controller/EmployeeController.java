package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	@PostMapping("/save")
	public String SaveEmployee(@RequestBody Employee emp) {
		Employee em=empservice.createEmployee(emp);
		String msg=null;
		if(em!=null) {
			return "Inserted successfully";
		}
		else {
		    return "Not Inserted" ;
		}
		
	}
	@DeleteMapping("/delete/{empid}")
	public String deleteEmp(@PathVariable Integer empid) {
		empservice.deleteEmployee(empid);
		return "deleted successfully";
		
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		List<Employee> e=empservice.getAllEmployees();
		return e;
	}
	@GetMapping("/get/{empid}")
	public Employee getOneEmp(@PathVariable Integer empid) {
		Employee r=empservice.getOneEmployee(empid);
		return r;
		
}
	@PutMapping("/update/{empid}")
	public Employee updateEmp(@PathVariable Integer empid,@RequestBody Employee emp) {
		return empservice.updateEmployee(empid, emp);
	}
}
