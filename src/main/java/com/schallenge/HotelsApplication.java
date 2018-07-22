package com.schallenge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.schallenge.accounts.Account;
import com.schallenge.accounts.AccountRepository;
import com.schallenge.utils.DbInitializer;

@SpringBootApplication
public class HotelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelsApplication.class, args);
	}

	@Bean
	CommandLineRunner populateDB(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			DbInitializer.createDefaultAdminAccount(accountRepository, passwordEncoder);
		};
	}
}
