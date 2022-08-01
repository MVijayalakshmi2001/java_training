package org.example.service;

import java.util.List;

import org.example.iface.ProfessorRepository;
import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentService {

	private StudentRepository studentRepo;
	private ProfessorRepository profRepo;
	
	public StudentService(StudentRepository studentRepo, ProfessorRepository profRepo) {
		super();
		this.studentRepo = studentRepo;
		this.profRepo = profRepo;
	}
	
	public Student add(Student entity) {

		return this.studentRepo.add(entity);
		}

		public List<Student> findAll(){
		return this.studentRepo.findAll();
		}
}
