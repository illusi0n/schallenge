package com.schallenge.accounts.dto;

public class CreateAccountDTO {

	private String username;
	private String password;

	public CreateAccountDTO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}