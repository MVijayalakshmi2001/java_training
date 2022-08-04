package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;


public class StudentServiceTest {

	@DisplayName(value = "Test find all method with mockito stub")
	@Test
	void testFindAll() {
		
		StudentRepository repo=mock(StudentRepository.class);
		
		StudentService service=new StudentService(repo);
		
		Student ramesh=new Student(301, "ramesh");
		Student suresh=new Student(302, "suresh");
		
		List<Student> list=new ArrayList<>();
		
		list.add(ramesh);
		list.add(suresh);

		// stubbing
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(2, service.findStudentSize());
		
	}
	
}
