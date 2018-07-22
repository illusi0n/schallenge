package com.schallenge.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.schallenge.accounts.Account;
import com.schallenge.accounts.AccountService;

public class DbInitializer {

	public static boolean createDefaultAdmin(AccountService accountService, PasswordEncoder passwordEncoder) {
		Account adminAccount = new Account();
		adminAccount.setUsername("admin");
		adminAccount.setPassword(passwordEncoder.encode("admin"));
		adminAccount.setRoles(new String[] { "ADMIN" });
		accountService.create(adminAccount);
		return true;
	}

	public static boolean createDefaultUser(AccountService accountService, PasswordEncoder passwordEncoder) {
		Account userAccount = new Account();
		userAccount.setUsername("user");
		userAccount.setPassword(passwordEncoder.encode("user"));
		userAccount.setRoles(new String[] { "USER" });
		accountService.create(userAccount);
		return true;
	}
}
