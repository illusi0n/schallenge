package com.schallenge.accounts.dto;

public class RestResponseAccountDTO {

	private String username;
	private String[] roles;

	public RestResponseAccountDTO() {
	}

	public RestResponseAccountDTO(String username, String[] roles) {
		this.username = username;
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

}