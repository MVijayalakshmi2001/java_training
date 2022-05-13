package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	
	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
//		
//		SeminarRepository repo=ctx.getBean(SeminarRepository.class);
//		
//		Seminar entity=ctx.getBean(Seminar.class);
//		
//		System.out.println(repo.save(entity));
//		
		
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);

				SeminarUtils obj=ctx.getBean(SeminarUtils.class);
				//obj.create();
				obj.findAll();
				ctx.close();
		
	}

	@Bean
	public Speaker siva() {
		
		return new Speaker(102,"siva","B.E");
	}
	
	@Bean
	public Seminar dataBase() {
		
		return new Seminar(202,"database",50,siva());
	}
	
	
		

}
