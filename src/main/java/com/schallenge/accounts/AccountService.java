package com.schallenge.accounts;

import java.util.List;

import com.schallenge.accounts.dto.CreateAccountDTO;

public interface AccountService {

	Account create(CreateAccountDTO newAccount);

	Account create(Account newAccount);

	Account findByUsername(String username);

	List<Account> getAll();
}