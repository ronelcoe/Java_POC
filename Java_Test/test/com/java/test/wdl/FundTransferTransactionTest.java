package com.java.test.wdl;

import static org.junit.Assert.*;

import org.junit.Test;

public class FundTransferTransactionTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		FundTransferTransaction.main(new String[0]);
		
//		assertEquals("ABCD", "ABCD");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		assertEquals(1300, FundTransferTransaction.getRonel().getAccountBalance().get());
		
	}

}
