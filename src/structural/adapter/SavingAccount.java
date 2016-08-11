package structural.adapter;
/*
 * target class
 */

public class SavingAccount extends BankAccount {

	
	
	@Override
	public double calculate() {
		
		return getServiceCharge();
	}
	
	public double getServiceCharge(){
		return 1000.00;
	}

}
