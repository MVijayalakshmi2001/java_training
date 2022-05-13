package com.example.demo.utils;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;
@Component
public class SeminarUtils {

@Autowired
Speaker speaker;

@Autowired
SeminarRepository repo;

@Autowired
Seminar seminar;


public void create() {
seminar.setSpeaker(speaker);

Seminar added=repo.save(seminar);

if(added!=null){
System.out.println("One Record Added");
}
}

public void findAll() {

List<Seminar> seminar=repo.findAll();
for(Seminar eachSeminar:seminar) {
System.out.println(eachSeminar.getId());
System.out.println(eachSeminar.getName());

Speaker speakers=eachSeminar.getSpeaker();
System.out.println(speaker.getId());
System.out.println(speaker.getQualification());
System.out.println(speaker.getFirstName());

}

}

}