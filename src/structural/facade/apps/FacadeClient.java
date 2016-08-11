package structural.facade.apps;
import java.util.*;

import structural.facade.domains.*;

public class FacadeClient {

	public static void main(String[] args) {
		
		ReservationFacade facade = new ReservationFacade();
		double indigo = facade.getFlightStatus().indiGoStatus(new Date());
		System.out.println("Ticket availbale: "+indigo);
		Map<String,Map<String,Integer>> details = facade.getAllStatus(new Date());
		
		System.out.println("Details of available flights: "+new Date());
		
		Map<String,Integer> flts = details.get("FlightStatus");
		
		System.out.println("Indigo: "+flts.get("Indigo"));
		System.out.println("SpiceJet: "+flts.get("SpiceJet"));
		
		Map<String,Integer> hotels = details.get("HotelStatus");
		System.out.println("Taj Hotel: "+hotels.get("Taj"));
		System.out.println("Oberoi Hotel: "+hotels.get("Oberoi"));
		
		
	}

}
