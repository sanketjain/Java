package com.aitacs.jee.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProjectTypeCatalog {

	@WebMethod
	public List<String> getProjectTypes(){

		List<String> projectTypes = new ArrayList<String>();
		projectTypes.add("INTERNAL");
		projectTypes.add("TRAINING");

		return projectTypes;
	}
	
}
