package structural.composite;

import java.util.*;

public class State implements Profitable {

	public String stateName;
	private List<Profitable> cities;
	
	
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	public List<Profitable> getCities() {
		return cities;
	}

	public void setCities(List<Profitable> cities) {
		this.cities = cities;
	}

	
	
	public State(String stateName) {
		super();
		this.stateName = stateName;
		cities = new ArrayList<Profitable>();
		
	}

	@Override
	public double getProfit() {
		double profit =0;
		for(Profitable obj:cities)
		{
			profit = profit + obj.getProfit();
		}
		
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		if(child instanceof City)
		{
			cities.add(child);
		}

	}

	@Override
	public void removeLeaf(Profitable child) {
		if(child instanceof City)
		{
			cities.remove(child);
		}

	}

}
