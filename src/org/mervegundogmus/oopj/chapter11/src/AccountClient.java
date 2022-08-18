package org.mervegundogmus.oopj.chapter11.src;

public class AccountClient {

	public void withdrawMoney(Account account, double amount) {
		System.out.println(amount + " TL miktarında para çekilmiştir.");
	}

	public void payIntoMoney(Account account, double amount) {
		System.out.println(amount + " TL hesabınıza para yatırılmıştır.");
		return;
	}

	public void transfer(Account myAccount, Account transferAccount, double amount) {
		if (myAccount.getBalance() < (amount)) {
			System.out.println("Paranız, havale yapılmak istenen tutardan azdır!");
			return;
		}
		
		System.out.println(amount + "TL havale işlemi gerçekleştirilmiştir.");

	}

}