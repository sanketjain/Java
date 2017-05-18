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
		User user = new User();
		user.setFirstName("Mark8");
		user.setLastName("Anthony8");
		user.setUserName("amark8");
		user.setCreatedDate(new Date());
		user.setPassword("amark8");
		user.setSecQues1("What is your nickname?");
		user.setSecAns1("Ant");
		manager.persist(user);
		
		User user1 = new User();
		user1.setFirstName("Ted9");
		user1.setLastName("McMichael9");
		user1.setUserName("mted9");
		user1.setCreatedDate(new Date());
		manager.persist(user1);
	}

}
