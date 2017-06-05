package com.infiniteskills.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.infiniteskills.data.entities.User;

public class HibernateUtil {

	//singleton design pattern, 1, 2 are private. 3 is public
	//1.
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	//2.
	private static SessionFactory buildSessionFactory(){

		try{
			Configuration configuration = new Configuration();
			//Configuration object will hold hibernate specific properties. 
			//Going to know how we want hibernate to perform
			//holds all of mapping information
			configuration.addAnnotatedClass(User.class); 
			return configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder() 
							.applySettings(configuration.getProperties())
							.build());
			//getProperties pass in our configuration to the standard service registry builder and 
			//builder pattern would invoke the builder method and 
			//pass the service registry into the build session factory method and
			//would eventually will end up with a session factory
			//Warning: As per hibernate documentation - gives incorrect snippet code
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("There was an error building the factory");
		}
	}	
	
	//3.
	public static SessionFactory getSessionFactory(){
		return sessionFactory; //provide our application with access to our singleton
	}	
}