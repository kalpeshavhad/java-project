package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.data.jpa.Repository.UserRepository;
import com.data.jpa.entities.User;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Kalpesh Avhad");
		user.setCity("Nashik");
		user.setStatus("Java Developer");
		
		User savedUser = userRepository.save(user);
		System.out.println(savedUser);
		
		
		
	}

}
