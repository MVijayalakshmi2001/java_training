package com.example;

import java.util.logging.*;

public class Application {

	public static void main(String[] args) {

		Logger log=Logger.getLogger("com.example.Application");
		
		log.setLevel(Level.INFO);
		
		log.info("Info Message");
		
		log.warning("Warning");
		
		log.severe("Severe");
		
		log.fine("I am fine message");
		
		
	}
	

}
