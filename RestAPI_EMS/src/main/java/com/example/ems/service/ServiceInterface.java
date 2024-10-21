package com.example.ems.service;

import java.util.List;

import com.example.ems.employee.Employee;

public interface ServiceInterface {
	
	
	public String save(Employee emp);
	
	public String saveAll(List<Employee> ListEmp);
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public String AltEmp(Employee emp);
	
	public String DelEmp(Integer emid);

}
