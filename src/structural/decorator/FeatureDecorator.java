package structural.decorator;

public class FeatureDecorator extends BankAccount {

	private BankAccount account;
	
	private FeatureDecorator(BankAccount account)
	{
		super();
		this.account = account;
	}
	
	
	@Override
	public double balanceToMaintain() {
		
		return account.balanceToMaintain();
	}

	
}
