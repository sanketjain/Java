package org.javaiw.service;
//This is my interface, which is also actual service
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.javaiw.model.Product;

@WebService(name="ProductServ")
public interface ProductIntf {

	@WebMethod
	public ArrayList<Product> getProducts(); //In a webservice if we write something in public method, then it is already a webmethod
	@WebMethod
	public boolean removeProduct(int pid);	
	@WebMethod
	public boolean addProduct(String pname, int price, String brand);
		
}


//We should always present our webservice as an interface. Thats why we give name SEI Service Endpoint Interface.
//The interface defines all the functions which are deliverable to the client

