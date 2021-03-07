package com.assignment.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	@Autowired
	private MembersRepository membersRepository;
	
	@Autowired
	private GymRepository gymRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("My application has started... ");
	}
	
	@Override
	public void run(String... args) throws Exception {
//		//Members
//		Iterable<Members> membersIterator = membersRepository.findAll();
//		
//		System.out.println("All the members: ");
//		membersIterator.forEach(item -> System.out.println(item));
//		membersIterator.forEach(item -> "11".equals(item.getEmail()) );
//		//Gym
//		Iterable<Gym> gymIterator = gymRepository.findAll();
//
//		System.out.println("All the gyms: ");
//		gymIterator.forEach(item -> System.out.println(item));
	}

}