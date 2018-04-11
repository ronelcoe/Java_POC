package com.java.test.wdl;

import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

public class FundTransferTransaction {
	
	private static PersonAccount ronel, siva;

	public static void main(String[] args) {
		ronel = new PersonAccount("Ronel Chavez", "0-1234", new AtomicLong(1500));
		siva = new PersonAccount("Siva Sivakumar", "0-4321", new AtomicLong(10000));
		
		new WithdrawalThread(ronel, siva, 200).start();
		
		
	}

	public static PersonAccount getRonel() {
		return ronel;
	}

	public static PersonAccount getSiva() {
		return siva;
	}

}
