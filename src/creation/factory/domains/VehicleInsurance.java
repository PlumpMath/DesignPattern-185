package creation.factory.domains;

enum Vehicles{CAR,BIKE,BUS}

public class VehicleInsurance extends Insurance {

	private Vehicles type;
	
	
	
	public VehicleInsurance(String policyHolderName, double policyAmount, Vehicles type) {
		super(policyHolderName, policyAmount);
		this.type = type;
	}



	@Override
	public double calculatePremium() {
		
		return 0;
	}

}
