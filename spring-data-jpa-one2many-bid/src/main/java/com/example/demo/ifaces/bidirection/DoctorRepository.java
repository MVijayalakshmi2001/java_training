package com.example.demo.ifaces.bidirection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bidirection.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
