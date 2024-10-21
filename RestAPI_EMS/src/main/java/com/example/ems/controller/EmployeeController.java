package com.example.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.ems.employee.Employee;
import com.example.ems.service.ServiceInterface;



@RestController
public class EmployeeController {
	
	@Autowired
	private ServiceInterface Service;
	
	@PostMapping("/Employee")
	public String saveEmp(@RequestBody Employee emp)
	{
	return	Service.save(emp);
	
	}
	
	@GetMapping("/Employees")
	public List<Employee> AllEmp()
	{
		return Service.findAll();
	}
	
	@GetMapping("Employee/{id}")
	public Employee findEmpById(@PathVariable Integer id)
	{
		return Service.findById(id);
	}
	
	@PutMapping("/Employee")
	public String updateEmp(@RequestBody Employee emp)
	{
		
	 return Service.AltEmp(emp);
	 
	}
	
	@DeleteMapping("Employee/{id}")
	public String DeleteEmp(@PathVariable Integer id)
	{
		return Service.DelEmp(id);
		
	}

}
