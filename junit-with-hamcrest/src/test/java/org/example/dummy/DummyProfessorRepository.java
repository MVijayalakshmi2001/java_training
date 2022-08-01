package org.example.dummy;


import org.example.iface.ProfessorRepository;

public class DummyProfessorRepository implements ProfessorRepository {

	@Override
	public String getQualification() {
		throw new AssertionError("Not yet implemented");
	}

}
