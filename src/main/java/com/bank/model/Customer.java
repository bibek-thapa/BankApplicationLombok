package com.bank.model;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@RequiredArgsConstructor
@Getter
@ToString
@Setter
@EqualsAndHashCode
public class Customer {

	private Integer custId;
	private String firstName;
	private String lastName;
	private String address;
	private String contact;
	private List<Account> accounts = new ArrayList<>();

	public Customer(Integer custId, String firstName, String lastName, String address, String contact, Account acc) {
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
		this.accounts.add(acc);
	}
	public void addAccount(Account acc) {
		this.accounts.add(acc);
	}
	

}
