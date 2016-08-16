package org.javaiw.service;
//Here we use metroservice to publish MyService1.java
import javax.xml.ws.Endpoint;

public class TryService {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/service/call", new MyService1());		
	
	}
}

//There is a service called metroservice, which is responsible for running soap webservices. Metro is part of glassfish server
//Metroservice comes as a part of jdk too.

//As long as we get red button in console, our service runs without a server. 
//Go to browser and type localhost:1234/service/call
//Click on wsdl link
//inside wsdl there is xsd file. Copy and paste it in new tab (http://localhost:1234/service/call?xsd=1)
