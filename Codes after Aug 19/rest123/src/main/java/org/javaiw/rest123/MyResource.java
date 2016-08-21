package org.javaiw.rest123;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")  //We define Path in restful webservices just like in soap based we used to have @webservice. 
//This particular java file would be accessed by name myresource as it is specified in path
public class MyResource {

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
