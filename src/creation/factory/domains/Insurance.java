package creation.factory.domains;

public abstract class Insurance {

	private String policyHolderName;
	private double policyAmount;
	public abstract double calculatePremium();
	
	public Insurance(String policyHolderName, double policyAmount) {
		super();
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public double getPolicyAmount() {
		return policyAmount;
	}

	
	
	
}
