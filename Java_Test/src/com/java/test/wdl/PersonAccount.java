package com.java.test.wdl;

import java.util.concurrent.atomic.AtomicLong;

public class PersonAccount {
	private String accountName;
	private String accountNumber;
	private AtomicLong accountBalance;
	
	public PersonAccount(String accountName, String accountNumber, AtomicLong accountBalance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AtomicLong getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(AtomicLong accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
