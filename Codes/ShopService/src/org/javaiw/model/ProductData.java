package org.javaiw.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//This is dataservice
//There are two ways to use dataservice
//First one is perfect and correct: connect your dataservice to database. 
//Second way is slightly lethargic: work with virtual database. This example is about virtual database.
public class ProductData {
	
	static Map<Integer,Product> data;
	static{
		data = new HashMap<>(); //Using HashMap to create database
		System.out.println("data service insitialised");
		data.put(1, new Product(1, "Nexus7", 30000, "Google"));
		data.put(2, new Product(2, "Macbook", 100000, "Apple"));
		data.put(3, new Product(3, "Alienware", 70000, "Dell"));
		data.put(4, new Product(4, "Surface", 25000, "Microsoft"));
		data.put(5, new Product(5, "Speaker", 15000, "Bose"));
		data.put(6, new Product(6, "i7", 8000 , "Intel"));
		data.put(7, new Product(7, "Kindle", 15000, "Amazon"));
	}
	
	public boolean addProduct(Product p1){ //addProduct takes Product p1 as argument
		try{
			p1.setPid(data.size()+1);
			data.put(data.size()+1, p1); //key is data.size()+1
			return true;
			} catch (Exception e){ return false; }
	}
	
	public boolean deleteProduct(int pid){
		try{data.remove(pid); //remove can throw and exception. If it is not found it will print sth. 
		return true;
		} catch(Exception e){
			e.printStackTrace();
			return false;
			}
	}
	
	public ArrayList<Product> getProducts(){
		return new ArrayList<>(data.values());
	}
}

