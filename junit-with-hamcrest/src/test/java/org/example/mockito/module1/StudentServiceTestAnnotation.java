package org.example.mockito.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTestAnnotation {

	@Mock
	StudentRepository repo;
	
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService service;
	
	@DisplayName(value = "Test find all method with mockito stub and annotation")
	@Test
	void testFindAllUsingAnnotation() {
		
		Student ramesh=new Student(301, "ramesh");
		Student suresh=new Student(302, "suresh");
		
		List<Student> list=new ArrayList<>();
		
		list.add(ramesh);
		list.add(suresh);

		// stubbing
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(2, service.findStudentSize());
	}
	
	@DisplayName("Test addwithcondition method of the service it should add elements"
			+ " roll number is greater than 2000 else it should return a null value")
	@Test
	void testAddWithCondition() {
		

		Student geetha=new Student(3030, "geetha");

		assertNotNull(service.addWithCondition(geetha));
		
		
	}
	
	@Test
	void testVerifyAddWithCondition() {
		
		Student geetha=new Student(3030, "geetha");
		
		serviceMock.addWithCondition(geetha);
		
		verify(serviceMock,times(1)).addWithCondition(geetha);

	}
}
