package com.BikkatIt.UserManagementApp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementAppApplication.class, args);
	}
	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
		
	}
}
