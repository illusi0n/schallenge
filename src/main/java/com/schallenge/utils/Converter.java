package com.schallenge.utils;

import java.util.ArrayList;
import java.util.List;

import com.schallenge.accounts.Account;
import com.schallenge.accounts.dto.CreateAccountDTO;
import com.schallenge.accounts.dto.RestResponseAccountDTO;

public class Converter {

	public static Account toEntity(CreateAccountDTO newAccount) {
		return new Account(newAccount.getUsername(), newAccount.getPassword());
	}

	public static List<RestResponseAccountDTO> toRestResponse(List<Account> accounts) {
		List<RestResponseAccountDTO> accountsDto = new ArrayList<>();
		for (Account account : accounts) {
			accountsDto.add(new RestResponseAccountDTO(account.getUsername(), account.getRoles()));
		}
		return accountsDto;
	}

}
