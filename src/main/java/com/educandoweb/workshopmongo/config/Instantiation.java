package com.educandoweb.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.workshopmongo.domain.User;
import com.educandoweb.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User u1 = new User(null, "Leona Heidern", "leona@kof.com");
		User u2 = new User(null, "Ralf Jones", "ralf@kof.com");
		User u3 = new User(null, "Clark Still", "clark@kof.com");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));

	}
}