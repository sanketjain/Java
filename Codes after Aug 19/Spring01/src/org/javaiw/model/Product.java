package org.javaiw.model;

import java.util.List;

//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

//@Repository
//@Service
//@Component
public class Product {
//public class Product implements ApplicationContextAware{
//public class Product implements BeanNameAware{
//public class Product implements InitializingBean, DisposableBean{


	int pid;
	String pname;
	String brand;
//	String bname;
	int price;
	
	Vendor vendor;
//	ApplicationContext ctx;
//	List<Vendor> vendors;

//	public List<Vendor> getVendors() { return vendors;	}
//	public void setVendors(List<Vendor> vendors) {		this.vendors = vendors;	}
	public Vendor getVendor() {return vendor;}
	
	@Autowired
	public void setVendor(Vendor vendor) {this.vendor = vendor;}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String pname, String brand, int price) {
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.price = price;
	}
	
	public Product() {
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pname+"---"+brand + "===" + price+ "--" + vendor;
/*		String s[] = ctx.getBeanDefinitionNames();
		String s1 = "";
		for(String ss:s) s1 += (ss+",");
		return pname+"---"+brand + "===" + price+ "--" + vendor + "\nout of "+ s1;	}
*/
//		return bname + ":   \n"+ pname+"---"+brand + "===" + price+ "--" + vendor;

		
/*	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		ctx = arg0;
		System.out.println("Initializing context");
	}
*/	
	}

//	public void destroy() throws Exception {		System.out.println("Destroy function called");			}
//	public void init() throws Exception {		System.out.println("Init function called");			}

	

/*	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init function called");
	}
*/
	
/*	@Override
	public void setBeanName(String arg0) {
		bname = arg0;
	}
*/		
	
//	public void show(){		System.out.println("Initialising product bean object");	}
//	public void destroy(){		System.out.println("Bye bye");	}

}


