package com.schallenge.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.schallenge.accounts.Account;
import com.schallenge.accounts.AccountRepository;

public class DbInitializer {
	
	public static boolean createDefaultAdminAccount(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
		Account adminAccount = new Account();
		adminAccount.setUsername("admin");
		adminAccount.setPassword(passwordEncoder.encode("admin"));
		adminAccount.setRoles(new String[] { "ADMIN" });
		accountRepository.save(adminAccount);
		return true;
	}
}
