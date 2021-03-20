/*  
 * Ibrahim Ali
 * 301022172
 * 20-03-2021
 * */

package com.assignment.mvc;

import java.util.List;

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
		
		gymRepository.deleteAll();
		
		// If gym table is empty, seed necessary data
		
		Gym loc1 = new Gym(1, "Toronto","123 Danfoth Ave");
		Gym loc2 = new Gym(2, "Ottawa","22 Queen Street");
		Gym loc3 = new Gym(3, "Niagra Falls","2 Leslie Street");
		Gym loc4 = new Gym(4, "London","5 Bloor Street");
		
		gymRepository.save(loc1);
		gymRepository.save(loc2);
		gymRepository.save(loc3);
		gymRepository.save(loc4);
		
		
		System.out.println("App is running");
	}

}