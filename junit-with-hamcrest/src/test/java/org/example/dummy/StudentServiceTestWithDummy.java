package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.fake.StudentRepoFake;
import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithDummy {

	@Test
	@DisplayName(value = "Test Add method return inserted object back")
	void testAddMethod() {
		
		StudentRepoFake fake=new StudentRepoFake();
		
		DummyProfessorRepository dummy = new DummyProfessorRepository();
		
		StudentService service=new StudentService(fake,dummy);
		
		Student ram=new Student(101, "Ram");
		
		Student actual=service.add(ram);
		
		assertEquals(actual, ram);
		
		
	}
}
