package org.example.ifaces;

import java.util.List;

import org.example.model.Student;

public interface StudentRepository {

	public Student add(Student entity);
	
	public List<Student> findAll();
		
}
