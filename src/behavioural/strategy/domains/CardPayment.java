package behavioural.strategy.domains;

import java.util.logging.Logger;

public class CardPayment implements PaymentStrategy {

	Logger log = Logger.getGlobal();
	
	@Override
	public void pay(double amount) {
	
		log.info(amount + " Payment received through credit card");
		
	}

}
