package com.java.test.wdl;

import java.util.concurrent.atomic.AtomicLong;

public class FundTransferTransaction {

	public static void main(String[] args) {
		PersonAccount ronel = new PersonAccount("Ronel Chavez", "0-1234", new AtomicLong(1500));
		PersonAccount siva = new PersonAccount("Siva Sivakumar", "0-4321", new AtomicLong(10000));
		
		new WithdrawalThread(ronel, siva, 240).start();
	}

}
