package org.example.services;

import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentService {

	private StudentRepository repo;
	
	
	
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public Student add(Student entity) {
		
		return this.repo.add(entity);
	}
	
	public List<Student> findAll(){
		
		return this.repo.findAll();
	}
	
	public int findStudentSize() {
		
		return this.repo.findAll().size();
	}
	
	


	public Student addWithCondition(Student student) {

		Student added=null;
		
		if(student.getRollNumber() >2000) {
			
		repo.add(student);
		
		added=student;
		
		}
		return added;
		
		}

	
}
	
