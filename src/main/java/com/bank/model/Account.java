package com.bank.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Account {

	private Integer accountNumber;
	private String accountType;
	private Integer balance;
	
	public Account(Integer accountNumber, String accountType, Integer balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	

	

	
}
