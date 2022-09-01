package org.mervegundogmus.oopj.week5.Account;

public class AccountClient {

	public void withdrawMoney(Account account, double amount) {
		System.out.println(amount + " TL amount has been withdrawn.");
	}

	public void payIntoMoney(Account account, double amount) {
		System.out.println(amount + " TL has been deposited into your account.");
		return;
	}

	public void transfer(Account myAccount, Account transferAccount, double amount) {
		if (myAccount.getBalance() < (amount)) {
			System.out.println(" Please enter the amount that can be transferred! ");
			return;
		}
		
		System.out.println(amount + " TL your transfer transaction has been completed.");

	}

}