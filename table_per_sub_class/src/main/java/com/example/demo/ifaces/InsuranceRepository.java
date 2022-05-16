package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Insurance;

public interface InsuranceRepository<T extends Insurance> extends JpaRepository<T, Integer> {

	@Query("from HealthInsurance")
	public List<Insurance> findHealthProducts();
	@Query("from LifeInsurance")
	public List <Insurance> findLifeProducts();
}
