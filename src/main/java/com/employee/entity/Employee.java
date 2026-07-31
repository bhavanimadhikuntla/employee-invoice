package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer empid;
   private String empName;
   private double salary;
   private String address;
   private long phno;
   private String email;
   public Employee() {
	super();
   }
   public Employee(Integer empid, String empName, double salary, String address, long phno, String email) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.salary = salary;
	this.address = address;
	this.phno = phno;
	this.email = email;
   }
   public Integer getEmpid() {
	return empid;
   }
   public void setEmpid(int empid) {
	this.empid = empid;
   }
   public String getEmpName() {
	return empName;
   }
   public void setEmpName(String empName) {
	this.empName = empName;
   }
   public double getSalary() {
	return salary;
   }
   public void setSalary(double salary) {
	this.salary = salary;
   }
   public String getAddress() {
	return address;
   }
   public void setAddress(String address) {
	this.address = address;
   }
   public long getPhno() {
	return phno;
   }
   public void setPhno(long phno) {
	this.phno = phno;
   }
   public String getEmail() {
	return email;
   }
   public void setEmail(String email) {
	this.email = email;
   }
   
	 
}
