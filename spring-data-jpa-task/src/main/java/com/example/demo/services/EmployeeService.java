package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee entity) {
		
		return this.repo.save(entity);
	}
	

	public Iterable<Employee> findAll(){
		return this.repo.findAll();	
	}
	
	public List<Employee> findByDateOfBirth(LocalDate date){
		
		return this.repo.findByDateOfBirth(date);
		
	}
	
	public List<Employee> findByLocation(String location){
		
		return this.repo.findByLocation(location);
	}
	
	public List<Employee> findBySkillSet(String skill){
		
		return this.repo.findBySkillSet(skill);
	}
	
	
	public List<Employee> findBySkillOrLocation(String skill,String location){
		
		return this.repo.findBySkillSetOrLocation(skill, location);
		
	}
	public List<Employee> findBySkillSetAndLocation(String skillSet,String location){
		return this.repo.findBySkillSetAndLocation(skillSet, location);
	}
}
