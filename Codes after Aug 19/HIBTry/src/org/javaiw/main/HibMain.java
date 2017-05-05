package org.javaiw.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.javaiw.model.Product;
import org.javaiw.model.Vendor;

public class HibMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		session.beginTransaction();
		
	//	Product p1 = new Product(2, "LaptopAlienware", "Dell", 83459);
	//	Product p1 = (Product)session.get(org.javaiw.model.Product.class, 1);	
		Product p1 = new Product(6, "wire", "GeneralE", 46);
		Product p11 = new Product(7, "Tube", "GeneralE", 473);
		
		Vendor v1 = new Vendor("Vijay", "Vijay@outlook.com");
		Vendor v11 = new Vendor("Ramesh", "Ramesh@outlook.com");
//		p1.getVendors().add(v1);
//		p1.getVendors().add(v11);
		
	//	p1.setVendor(v1);
	//	p1.setVendor(v11);
		p1.getVendors().add(v1);
		p1.getVendors().add(v11);
		p11.getVendors().add(v11);

//		p1.setDop(new Date(System.currentTimeMillis()));
		session.save(p1);
		session.save(p11);
		session.save(v1);
		session.save(v11);
		
	//	p1.setPname("LaptopInspironnew");
//		session.delete(p1);
		session.getTransaction().commit();
		session.close();
	}
}
