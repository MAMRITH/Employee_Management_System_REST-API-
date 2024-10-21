package com.example.ems.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ems.employee.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class EmployeeImp implements EmployeeDao {
	@Autowired
	EntityManager entityManager;

	@Override
	@Transactional
	public String save(Employee emp) {
		entityManager.persist(emp);
		return "Employee Data Saved Sucessfully... ";
	}

	@Override
	public List<Employee> findAll() {
	TypedQuery<Employee> empList=entityManager.createQuery("From Employee",Employee.class);
	List<Employee> employees=empList.getResultList();
	return employees;
	}

	@Override
	@Transactional
	public String saveAll(List<Employee> ListEmp) {
		entityManager.persist(ListEmp);
		return "List of All Employee Data Sucessfully Saved...";
	}

	@Override
	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);
	
	}

	@Override
	@Transactional
	public String AltEmp(Employee emp) {
		 entityManager.merge(emp);
		 
		 return "Data Updated...";
		
	}

	@Override
	@Transactional
	public String DelEmp(Integer emid) {
		Employee emp =entityManager.find(Employee.class, emid);
		entityManager.remove(emp);
		return emid+" th Employee Data Removed From DataBase... ";
	}


		
	
	
}
