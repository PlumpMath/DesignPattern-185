package structural.composite;

public class Store implements Profitable {
	private double profit;
	private String storeName;
	
		
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}
	
		
	public Store(double profit, String storeName) {
		super();
		this.profit = profit;
		this.storeName = storeName;
	}

	@Override
	public double getProfit() {
		
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		

	}

	@Override
	public void removeLeaf(Profitable child) {
		

	}

}
