package creation.prototype.domains;

public class CardCache {

	private CreditCard card;
	
	public void loadProduct(CreditCard card)
	{
		this.card = card;
	}
	
	public CreditCard getCachedCard() throws CloneNotSupportedException
	{
		CreditCard card2 = (CreditCard)card.clone();
		card2.setCreditLimit(card2.getCreditLimit()+999);
		return card2;
	}

	public CreditCard getCard() {
		return card;
	}
	
}
