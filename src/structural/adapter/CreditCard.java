package structural.adapter;

/*
 * 
 */

public class CreditCard {
	private double amountDue;
	

	public double calculateMinimumAmount()
	{
		return amountDue*0.05;
	}
	
	
	public CreditCard(double amountDue) {
		super();
		this.amountDue = amountDue;
	}
	
	
	
	
}
