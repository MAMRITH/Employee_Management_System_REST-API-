package com.example.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.dao.EmployeeDao;
import com.example.ems.employee.Employee;

import jakarta.transaction.Transactional;
@Service
public class EmployeeService implements ServiceInterface {
	@Autowired
	private EmployeeDao employeeDao; 
	
	@Override
	@Transactional
	public String save(Employee emp) {
		employeeDao.save(emp);
		return "Employee Data Saved Sucessfully... ";
	}

	@Override
	public String saveAll(List<Employee> ListEmp) {
		
		return "Employee Data Saved Sucessfully... ";
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee findById(int id) {
		
		return employeeDao.findById(id);
	}

	@Override
	@Transactional
	public String AltEmp(Employee emp) {
		
		return employeeDao.AltEmp(emp);
	}

	@Override
	@Transactional
	public String DelEmp(Integer emid) {
		employeeDao.DelEmp(emid);
		return emid+"th Employee Data Removed From DataBase... ";
	}
	
	

}
