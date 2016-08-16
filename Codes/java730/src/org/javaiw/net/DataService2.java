//Supporting files are DemoServer1.java and DemoClient1.java

package org.javaiw.net;
import java.util.HashMap;

public class DataService2 {

	static HashMap<String, String> wdata; //We want to store weather
	static{ //static block
		wdata = new HashMap<>();
		wdata.put("Paris", "Cool and pleasent summer");
		wdata.put("New York", "Beginning good summer");
		wdata.put("California", "Please no summer too warm");
		wdata.put("Florida", "We migrate to NY for summer");
		wdata.put("Sweden", "I love summer");
		wdata.put("India", "God save from this summer");
		wdata.put("Africa", "Winter is also summer");
		wdata.put("Australia", "New so need to find out");
		wdata.put("Chicago", "Trekking time");
	}

	public String getWeather(String city){ //We ask to get weather for city
		return wdata.get(city); //It return the weather over there
	}
}
