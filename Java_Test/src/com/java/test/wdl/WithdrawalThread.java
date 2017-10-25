package com.java.test.wdl;

public class WithdrawalThread extends Thread {
	PersonAccount source, receiver;
	long withdrawalAmount;

	public WithdrawalThread(PersonAccount source, PersonAccount receiver, long withdrawalAmount) {
		super();
		this.source = source;
		this.receiver = receiver;
		this.withdrawalAmount = withdrawalAmount;
	}

	private synchronized boolean withdrawMoney() {
		try {
			source.getAccountBalance().getAndSet(source.getAccountBalance().longValue() - withdrawalAmount);
			receiver.getAccountBalance().getAndSet(receiver.getAccountBalance().longValue() + withdrawalAmount);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Log: Transaction not successfull, unable to perform withdrawal operation");
			return false;
		}
		return true;
	}

	private synchronized boolean persistToDB() {
		try {
			// apply DB transactional block to persist new values

			System.out.println("Source balance: " + source.getAccountBalance().get());
			System.out.println("Receiver balance: " + receiver.getAccountBalance().get());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Log: Transaction not successfull, unable to perform DB operation, rollback performed");
			return false;
		} 
		return true;
	}

	public void run() {
		boolean transactedToDB = false;
		if (withdrawMoney())
			transactedToDB = persistToDB();

		if (transactedToDB)
			System.out.println("Log: Transaction is successfull");
		else
			System.out.println("Log: Transaction is not successfull");
	}
}
