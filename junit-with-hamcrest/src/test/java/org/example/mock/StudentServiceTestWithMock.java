package org.example.mock;

import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {

	@DisplayName(value = "Test verify add method with mock")
	@Test
	void testAddWithMock() {
		
		StudentServiceMock mock=new StudentServiceMock();
		
		StudentService service=new StudentService(mock);
		
		Student kavi=new Student(201, "Kavitha");
		Student kavya=new Student(202, "Kavya");


		service.add(kavi);
		service.add(kavya);
		
		mock.verify(kavya, 1);
		
	}
}


