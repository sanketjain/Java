package org.javaiw.main;

import org.javaiw.model.Product;
import org.javaiw.model.Vendor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Product p1 = (Product)context.getBean("product1");
		p1.setPname("AAAA");
		Vendor v1 = (Vendor)context.getBean("vendor1");
		//System.out.println(v1.getVname());
		v1.setVname("Vendor1");
		v1.setVemail("mr.sanketjain@gmail.com");
		System.out.println(p1);
	}
} 

