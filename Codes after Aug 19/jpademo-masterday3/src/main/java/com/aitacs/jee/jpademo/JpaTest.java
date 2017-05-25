package com.aitacs.jee.jpademo;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.aitacs.jee.jpademo.entities.User;

public class JpaTest {

	private static EntityManager manager;
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpademo");
		manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();		
		transaction.begin();		
		createUser();
		transaction.commit();
		
	}
	
	private static void createUser(){
		User user = new User("Mark8", "Anthony8", "amark", 35, null, null);
		manager.persist(user);
		
		User user1 = new User("Ted9", "McMichael9", "mted9", 45, null, null);
		manager.persist(user1);
	}

}
