package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.entities.User;

public class Application {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		//grab sessionfactory using get method, then open session with opensession method
		//session.beginTransaction(); //begin transaction
		//session.close(); //close that session
		
		session.getTransaction().begin();
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedDate(new Date());
		user.setCreatedBy("Kevin");
		user.setEmailAddress("kmb38@yahoo.com");
		user.setFirstName("Kevin");
		user.setLastName("Bowersox");
		user.setLastUpdatedBy("kevin");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		
	//	session.getTransaction().commit();
		session.close();
	}
}
