package org.javaiw.rest123.model;

import java.util.*;


public class ProductData {
	
	static Map<Integer,Product> plist;
	
	static{
		plist = new TreeMap<>(); 
		plist.put(1, new Product(1, "Nexus7", 30000));
		plist.put(2, new Product(2, "Macbook", 100000));
		plist.put(3, new Product(3, "Alienware", 70000));
	}
	
	public Map<Integer, Product> getAllProducts(){
		return plist;
	}
	
	
	public boolean addProduct(String pname, int price){ 
		try{
			Product p1 = new Product();
			p1.setproductName(pname);
			p1.setPrice(price);
			p1.setproductId(plist.size()+1);
			plist.put(p1.getproductId(), p1); 
			return true;
			} catch (Exception e){ return false; }
		}
	
	public boolean removeProduct(int pid){
		Product p = plist.get(pid);
		if(p==null) return false;
		plist.remove(pid);
		return true;	
	}
}

