package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Description;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Table(name = "viji_trip_history")
@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor
@NoArgsConstructor
public class TripHistory {

	@Id
	@Column(name = "trip_id")
	int tripId;
	
	@Column(name = "trip_date_time")
	@DateTimeFormat(iso=ISO.DATE_TIME)
	//@Schema(@Description(value = "yyyy-mm-ddThr-min-sec"))
	LocalDateTime tripDateTime;
	
	@Column(name = "source")
	String source;
	
	@Column(name = "destination")
	String destination;
	
	@Column(name = "amount")
	double amount;
}
