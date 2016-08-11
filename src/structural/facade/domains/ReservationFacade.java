package structural.facade.domains;

import java.util.*;

public class ReservationFacade {

	private HotelAvailabilty hotelStatus;
	private FlightAvailabilty flightStatus;
	
	public ReservationFacade()
	{
		hotelStatus = new HotelAvailabilty();
		flightStatus = new FlightAvailabilty();
	}

	public Map<String,Map<String,Integer>>getAllStatus(Date date)
	{
		Map<String,Map<String,Integer>> list = new HashMap<String,Map<String,Integer>>();
		
		
		Map<String,Integer> fltList = new HashMap<String,Integer>();
		
		fltList.put("Indigo",flightStatus.indiGoStatus(date));
		fltList.put("SpiceJet",flightStatus.spiceJetStatus(date));
		
		
		Map<String,Integer> hotelList = new HashMap<String,Integer>();
		
		
		hotelList.put("Oberoi",hotelStatus.oberoiHotelStatus(date));
		hotelList.put("Taj",hotelStatus.tajHotelStatus(date));
		
		list.put("FlightStatus",fltList);
		list.put("HotelStatus",hotelList);
		
		
		return list;
		
		
	}
	
	public HotelAvailabilty getHotelStatus() {
		return hotelStatus;
	}

	public FlightAvailabilty getFlightStatus() {
		return flightStatus;
	}
	
	
	
}
