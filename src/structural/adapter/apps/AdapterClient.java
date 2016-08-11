package structural.adapter.apps;

import structural.adapter.AccountAdaptor;
import structural.adapter.CreditCard;

public class AdapterClient {

	public static void main(String[] args) {
		
		CreditCard card = new  CreditCard(45000);
		AccountAdaptor adaptor = new AccountAdaptor(card);
		System.out.println("Total amount due: "+adaptor.calculate());
		
		
		
	}

}
