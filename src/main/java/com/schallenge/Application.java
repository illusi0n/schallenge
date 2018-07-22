package com.schallenge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.schallenge.accounts.AccountService;
import com.schallenge.hotels.HotelService;
import com.schallenge.utils.DbInitializer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner populateDB(AccountService accountService, PasswordEncoder passwordEncoder, HotelService hotelService) {
		return args -> {
			DbInitializer.createDefaultAdmin(accountService, passwordEncoder);
			DbInitializer.createDefaultUser(accountService, passwordEncoder);
			DbInitializer.createHotels(hotelService);
		};
	}
}
