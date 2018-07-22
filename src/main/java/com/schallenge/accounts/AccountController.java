package com.schallenge.accounts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schallenge.accounts.dto.CreateAccountDTO;
import com.schallenge.accounts.dto.RestResponseAccountDTO;
import com.schallenge.utils.Converter;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/accounts")
	public String create(@RequestBody CreateAccountDTO newAccount) {
		accountService.create(newAccount);
		return "Success";
	}

	@GetMapping("/accounts")
	public List<RestResponseAccountDTO> getAll() {
		return Converter.toRestResponse(accountService.getAll());
	}
}