package creation.prototype.apps;

import creation.prototype.domains.CardCache;
import creation.prototype.domains.CreditCard;

public class ProtoTypeClient {

	public static void main(String[] args) 
	{
	
		CreditCard card = new CreditCard(1999,"Ramesh","A+",50000);
		
		CardCache cache = new CardCache();
		System.out.println("Original Card Hash Code: "+card.hashCode());
		System.out.println("Initial Credit Limit: "+card.getCreditLimit());
		cache.loadProduct(card);
		
		try{
		
		CreditCard cachedCard = cache.getCachedCard();
		System.out.println("Cached Card Hash Code = "+cachedCard.hashCode());
		System.out.println("Credit Limit: "+cachedCard.getCreditLimit());
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
				
		

	}

}
