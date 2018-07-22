package com.schallenge.accounts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.schallenge.accounts.dto.CreateAccountDTO;
import com.schallenge.utils.Converter;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Account create(CreateAccountDTO newAccount) {
		Account newAccountEntity = Converter.toEntity(newAccount);
		newAccountEntity.setRoles(new String[] { "USER" });
		newAccountEntity.setPassword(passwordEncoder.encode(newAccount.getPassword()));
		return accountRepository.save(newAccountEntity);
	}

	@Override
	public Account findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}

	@Override
	public Account create(Account newAccount) {
		return accountRepository.save(newAccount);
	}

	@Override
	public List<Account> getAll() {
		return accountRepository.findAll();
	}

}