package org.javaiw.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.javaiw.model.Product;

public class HibMain2 {

	public static void main(String[] args) {
	
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		session.beginTransaction();
//		Query query = session.createQuery("from Product where price<50");
//		Query query = session.createQuery("from Product where price<?");
		Query query = session.createQuery("from Product where price<:price");
		query.setInteger("price", 30);
		

		//query.setInteger(0, 50);

		List<Product> list = query.list();
		for(Product p1:list){
			System.out.println(p1.getPname() + "   " + p1.getBrand() + "   " + p1.getPrice());
		}

	}

}
