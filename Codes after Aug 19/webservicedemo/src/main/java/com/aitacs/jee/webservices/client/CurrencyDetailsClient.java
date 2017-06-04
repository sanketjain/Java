package com.aitacs.jee.webservices.client;

import net.webservicex.Country;
import net.webservicex.CountrySoap;

public class CurrencyDetailsClient {

	public static void main(String[] args) {
	
		Country country  = new Country();
		
		CountrySoap soap = country.getCountrySoap();
		
		String isoCountryCode = soap.getISOCountryCodeByCountyName("India");
		
		System.out.println("Iso Country Code for India: " + isoCountryCode);
	
		String countries = soap.getCountries();
		
		System.out.println("Countries : " + countries);
	}

}
