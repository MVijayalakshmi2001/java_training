package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public List<Employee> findByDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String location);
	
	public List<Employee> findBySkillSet(String skill);
	
	public List<Employee> findBySkillSetOrLocation(String skill,String location);
	
	@Query(nativeQuery=true,value="select employee_id,employee_name,date_of_birth,location,skill_set,phone_number from vijim_employee where skill_set=:skill and location=:location")
	public List<Employee> findBySkillSetAndLocation(@Param("skill")String skill,
			@Param("location")String location);
	
}
