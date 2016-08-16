package org.javaiw.serverMain;

import java.util.Scanner;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

//We got main class here. And in net.webservice we got entire webservice as a stub
//GlobalWeather.java is main class
public class Main {

	public static void main(String[] args) {
		
		GlobalWeather srvc = new GlobalWeather(); //Create object of service
		GlobalWeatherSoap soap = srvc.getGlobalWeatherSoap(); //this would return object of global weather soap, got the handle soaphandle

		//We are creating a console interface to try our service
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the country name");
		String country = in.nextLine(); //Take country name from user
		
		String cities = soap.getCitiesByCountry(country); //calling functions from soaphandle
		System.out.println(cities);//got results
		
		System.out.println("Enter the city name");
		String city = in.nextLine();
		String weather = soap.getWeather(city, country); //calling functions from soap handle
		System.out.println("Result is \n\n" + weather);
	}
}
