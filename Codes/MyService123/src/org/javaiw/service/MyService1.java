package org.javaiw.service;

import javax.jws.WebService;

//Because we add @ annotation here, so following is webservice

@WebService
public class MyService1 {
	
	public String sayHello(String name){
		return "A big hello to " + name;
	}

	public String getReply(){
		return "This is demo service";
	}
}
