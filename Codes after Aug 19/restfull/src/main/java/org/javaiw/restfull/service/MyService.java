package org.javaiw.restfull.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.javaiw.restfull.model.FilterBean;
import org.javaiw.restfull.model.Product;
import org.javaiw.restfull.model.ProductData;

@Path("Products")
public class MyService {
	
	ProductData data = new ProductData();
	
	@GET 
    @Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Product> getProducts(){
		return new ArrayList<>(data.getAllProducts().values());
	}
	
	@GET
	@Path("/{ProductId}")
	@Produces(MediaType.APPLICATION_JSON)
//	public ArrayList<Product> getProductById(@PathParam("ProductId")int ProductId){
	public ArrayList<Product> getProductById(@BeanParam FilterBean bean){

//		Product p1 = data.getAllProducts().get(ProductId);
		Product p1 = data.getAllProducts().get(bean.getProductId());
		ArrayList<Product> list = new ArrayList<>();
		list.add(p1);
		return list;
	}
	
	
	@GET
	@Path("/filter")
	@Produces(MediaType.APPLICATION_JSON)
//	public ArrayList<Product> getProductByMaxPrice(@MatrixParam("pname") String pname, @QueryParam("maxp")int maxp){
	public ArrayList<Product> getProductByMaxPrice(@BeanParam FilterBean bean){
	List<Product> list1 = new ArrayList<>(data.getAllProducts().values());
		ArrayList<Product> list = new ArrayList<>();
		for(Product p1:list1)
//			if(maxp==0 || p1.getPrice()<maxp)
			if(bean.getMaxp()==0 || p1.getPrice()<bean.getMaxp())
				list.add(p1);
		
		ArrayList<Product> list2 = new ArrayList<>();
		for(Product p1:list)
//			if(pname==null || p1.getproductName().toUpperCase().contains(pname.toUpperCase()))
			if(bean.getPname()==null || p1.getproductName().toUpperCase().contains(bean.getPname().toUpperCase()))
				list2.add(p1);
		return list2;
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Product addProduct(Product product){
		return data.addProduct(product.getproductName(), product.getPrice());
	}
	
	@DELETE
	@Path("/{ProductId}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean deleteProduct(@PathParam("ProductId")int ProductId){
		return data.removeProduct(ProductId);
	}
}



