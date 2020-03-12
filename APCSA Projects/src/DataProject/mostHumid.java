package DataProject;

import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class mostHumid {
	 public static void main(String[] args) {
		 DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
	     ArrayList<humidStation> allStations = ds.fetchList(humidStation.class, "station/station_name", "station/state","station/station_id");
	     System.out.println(allStations.size());
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the state abbreviation to find the highest humidity: ");
	     String state = sc.next();
	     humidStation highest = allStations.get(0);
	     for (humidStation hs: allStations) {
	    	 if (hs.getState().equals(state)) {
	    		 String id = hs.getId();
	    		 DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml").load();
	    		 humidStation hs1 = ds1.fetch(humidStation.class,"station_id","relative_humidity");
	    		 hs.setHumidity(hs1.getHumidity());
	    		 if (hs.getHumidity() > highest.getHumidity())
	    			 highest = hs;
	    	 }
	     }
	 }
}
