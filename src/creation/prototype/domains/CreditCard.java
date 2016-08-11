package creation.prototype.domains;

public class CreditCard implements Cloneable {

	private long cardNumber;
	private String cardHolderName;
	private String creditRating;
	private double creditLimit;
	
	
	
	
	public CreditCard(long cardNumber, String cardHolderName, String creditRating, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditRating = creditRating;
		this.creditLimit = creditLimit;
	}

	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}


	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}






	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
	
}
