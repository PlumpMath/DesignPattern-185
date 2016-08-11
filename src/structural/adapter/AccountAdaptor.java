package structural.adapter;

/*
 *Represents the Adapter. 
 */

public class AccountAdaptor extends SavingAccount {

	private CreditCard card;
	
	
	public AccountAdaptor(CreditCard card) {
		super();
		this.card = card;
	}
	
	
	@Override
	public double calculate() {
		double totalDue = card.calculateMinimumAmount() + super.calculate();
		return totalDue;
	}

	

}
