package com.schallenge.config.security;

import org.springframework.beans.factory.annotation.Autowired;

import com.schallenge.accounts.Account;
import com.schallenge.accounts.AccountService;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	AccountService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account existingUser = userService.findByUsername(username);

		if (existingUser == null) {
			throw new UsernameNotFoundException("User not found");
		}
		UserBuilder builder = User.builder();
		builder.username(username).password(existingUser.getPassword()).roles(existingUser.getRoles());
		return builder.build();
	}

}
