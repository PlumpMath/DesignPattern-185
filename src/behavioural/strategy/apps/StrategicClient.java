package behavioural.strategy.apps;

import behavioural.strategy.domains.*;

public class StrategicClient {

	public static void main(String[] args) {
		
		PatientContext patient1 = new PatientContext();
		
		// Collections.sort(new NameComparator());
		patient1.setStrategy(new CardPayment());
		
		patient1.makePayment(5600);
		

		PatientContext patient2 = new PatientContext();
		// Collections.sort(new AgeComparator());
		
		patient2.setStrategy(new CashPayment());
		
		patient2.makePayment(8600);
	}

}
