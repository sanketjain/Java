package com.aitacs.jee.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.aitacs.jee.webservices.domain.ProjectInfo;

@WebService(name="PTC", portName="PTCPort", serviceName="PTCService")
public class ProjectTypeCatalog {

	//List<String> projectTypes = null;
	// @SOAPBinding(style=Style.RPC)
	@WebMethod(operationName="getPTList")
	public List<String> getProjectTypes(){
		List<String> projectTypes = new ArrayList<String>();
		projectTypes.add("INTERNAL");
		projectTypes.add("TRAINING");
		//	addProjectTypes();		
		return projectTypes;
	}
	
	@WebMethod(exclude=true)
	public void addProjectTypes(){
		List<String> projectTypes = null;
		projectTypes = new ArrayList<String>();
		projectTypes.add("INTERNAL");
	}   
	
	public ProjectInfo getProjectInfo(){		
		ProjectInfo info = new ProjectInfo();
		info.setProjectLead("Pradeep");
		info.setProjectCode("PC1");
		info.setProjectName("Project X");
		info.setProjectId(1);
		info.setProjectStartDate(new Date());
		info.setProjectEndDate(new Date());
		return info;		
	}
}