package com.example.demo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.ifaces.PassengerRepository;
import com.example.demo.services.PassengerService;

@SpringBootApplication
public class SpringJpaOne2manyUniApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringJpaOne2manyUniApplication.class, args);
		
		
		
		//ctx.close();
	}

	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Passenger pass=new Passenger();
				pass.setPassengerId(101);
				pass.setPassengerName("moni");
				pass.setEmail("moni@gmail.com");
				pass.setLocation("palani");
				TripHistory trip1=new TripHistory(200, LocalDateTime.of(2022,9,5,3,30), "chennai", "ooty", 5000.00);
				TripHistory trip2=new TripHistory(201, LocalDateTime.of(2022,10,12,4,45), "Trichy", "kerala", 10000.00);
				TripHistory trip3=new TripHistory(202, LocalDateTime.of(2022,8,15,5,45), "karur", "delhi", 30000.00);
				
				List<TripHistory> list=Arrays.asList(trip1,trip2,trip3);
				
				pass.setTripList(list);
				repo.save(pass);
			}
	
		};
	}
}
	
		

