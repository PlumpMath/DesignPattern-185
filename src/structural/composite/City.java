package structural.composite;

import java.util.*;

public class City implements Profitable {

	String cityName;
	private List<Profitable> stores;
	
	
	
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Profitable> getStores() {
		return stores;
	}

	public void setStores(List<Profitable> stores) {
		this.stores = stores;
	}

	
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
		stores = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {
		double profit =0;
		for(Profitable obj:stores)
		{
			profit = profit + obj.getProfit();
		}
		
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		if(child instanceof Store)
		{
			stores.add(child);
		}

	}

	@Override
	public void removeLeaf(Profitable child) {
		if(child instanceof Store)
		{
			stores.remove(child);
		}

	}

}
