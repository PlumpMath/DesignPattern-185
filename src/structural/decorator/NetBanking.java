package structural.decorator;

import structural.adapter.BankAccount;

public class NetBanking extends FeatureDecorator {

	private BankAccount account;
	private double minBalance=5000;
	
	
	
	public NetBanking(BankAccount account) {
		super();
		this.account = account;
	}



	public double balanceToMaintain()
	{
		return minBalance + account.balanceToMaintain();
	}

}
