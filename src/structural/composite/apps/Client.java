package structural.composite.apps;

import structural.composite.*;

public class Client {

	public static void main(String[] args) {
		
		Store s1 = new Store(5000,"A");
		Store s2 = new Store(3000,"B");
		Store s3 = new Store(6000,"C");
		
		City delhi = new City("Delhi");
		delhi.addLeaf(s1);
		delhi.addLeaf(s2);
		delhi.addLeaf(s3);
		
		
		Store s4 = new Store(1500,"AA");
		Store s5 = new Store(2500,"BB");
		Store s6 = new Store(3500,"CC");
		
		
		City gurgaon = new City("Gurugram");
		
		gurgaon.addLeaf(s4);
		gurgaon.addLeaf(s5);
		gurgaon.addLeaf(s6);

		
		State state =  new State("Haryana");
		
		state.addLeaf(gurgaon);
		state.addLeaf(delhi);
		
		System.out.println("Total Collection for city:  "+delhi.getCityName()+"\t"+delhi.getProfit());
		System.out.println("Total Collection for city:  "+gurgaon.getCityName()+"\t"+gurgaon.getProfit());
		
		System.out.println("===========================");
		
		System.out.println("Total Collection for State:  "+state.getStateName()+"\t"+state.getProfit());
	}

}
