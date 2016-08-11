package creation.factory.application;
import creation.factory.domains.*;

public class FactoryClient {

	public static void main(String[] args) {
		
		Factory factory = new InsuranceFactory();
		
		Insurance insurance = factory.getInstance(2);
		System.out.println(insurance.calculatePremium());
		//System.out.println(InsuranceStaticFactory.getInstance(2));
		
	}

}
