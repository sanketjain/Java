package com.infiniteskills.data;

import org.hibernate.Session;

public class Application {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		//grab sessionfactory using get method, then open session with opensession method
		session.beginTransaction(); //begin transaction
		session.close(); //close that session
	}

}
