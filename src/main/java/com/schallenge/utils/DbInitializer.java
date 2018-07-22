package com.schallenge.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.schallenge.accounts.Account;
import com.schallenge.accounts.AccountService;
import com.schallenge.hotels.Hotel;
import com.schallenge.hotels.HotelService;

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

	public static boolean createHotels(HotelService hotelService) {
		createJavaHotels(hotelService);
		createBelgradeHotels(hotelService);
		return true;
	}

	private static void createJavaHotels(HotelService hotelService) {
		// create 3 hotels named Java on different address
		String name = "Java";
		String[] addresses = new String[] { "Belgrade", "Novi Sad", "Nis" };
		String description = "Random description";
		double rating = 1.337;
		for (String address : addresses) {
			hotelService.create(new Hotel(name, address, description, rating));
		}
	}

	private static void createBelgradeHotels(HotelService hotelService) {
		String address = "Belgrade";
		String[] names = new String[] { "Scala", "Groovy", "C#" };
		String description = "Random description";
		double rating = 1.337;
		for (String name : names) {
			hotelService.create(new Hotel(name, address, description, rating));
		}
	}
}