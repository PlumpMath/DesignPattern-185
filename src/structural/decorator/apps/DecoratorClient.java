package structural.decorator.apps;

import structural.adapter.SavingAccount;

public class DecoratorClient {

	public static void main(String[] args) {
		
		SavingAccount acc = new SavingAccount();
		System.out.println("Plain saving account min balance: "+acc.balanceToMaintain);
		
		BankAccount acc = new SavingAccount();
		System.out.println("Plain saving account min balance: "+acc.balanceToMaintain);

	}

}
