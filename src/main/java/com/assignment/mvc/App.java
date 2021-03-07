/*  
 * Ibrahim Ali
 * 301022172
 * 09-03-2021
 * */

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

	}

}