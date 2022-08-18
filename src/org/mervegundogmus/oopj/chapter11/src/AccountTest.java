package org.mervegundogmus.oopj.chapter11.src;
public class AccountTest {

	public static void main(String[] args) {
		AccountClient accountClient = new AccountClient();
		Account myAccount = new Account();
		Account transferAccount = new Account();

		accountClient.withdrawMoney(myAccount, 50);
		accountClient.payIntoMoney(myAccount, 7600);
		accountClient.transfer(myAccount, transferAccount, 600);

	}
}