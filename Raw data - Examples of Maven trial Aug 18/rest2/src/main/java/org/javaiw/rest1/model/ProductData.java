package org.javaiw.rest1.model;

import java.util.*;

public class ProductData {
	
	static Map<Integer, Product> plist;
	
	static{
		plist = new TreeMap<Integer, Product>();
		plist.put(1 , new Product(1, "MS Mouse wireless", 623));
		plist.put(2 , new Product(2, "HP Keyboard", 662));
		plist.put(3 , new Product(3, "JBL Speaker", 8346));
	}

	public Map<Integer, Product> getAllProducts(){
		return plist;
	}
	
	public Product addProduct(String pname, int price){
		try{
			Product p1 = new Product();
			p1.setProductName(pname);
			p1.setPrice(price);
			p1.setProductId(plist.size()+1);
			plist.put(p1.getProductId(), p1);
			return p1;
		}catch(Exception e){return null;}
	}
	
	public boolean removeProduct(int pid){
		Product p = plist.get(pid);
		if(p==null) return false;
		plist.remove(pid);
		return true;
	}	
}
