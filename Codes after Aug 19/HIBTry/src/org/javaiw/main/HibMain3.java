package org.javaiw.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistryBuilder;
import org.javaiw.model.Product;

public class HibMain3 {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Product.class);
//		criteria.add(Restrictions.lt("price", 5000));
//		criteria.add(Restrictions.in("pname", new Object[]{"HP", "Apple", "Samsung"}));
		criteria.add(Restrictions.ilike("pname", "apple"));
				
		List<Product> list = criteria.list();
		for(Product p1:list){
			System.out.println(p1.getPname() + "   " + p1.getBrand() + "   " + p1.getPrice());
		}

	}
}
