package jpademo;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aitacs.jee.jpademo.entities.Car;
import com.aitacs.jee.jpademo.entities.User;

public class JPARelationshipTest {

	EntityManagerFactory emFactory;
	EntityManager manager;
	EntityTransaction transaction;

	@Before
	public void setUp() throws Exception {
		emFactory = Persistence.createEntityManagerFactory("jpademo");
		manager = emFactory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();

	}

	@After
	public void tearDown() throws Exception {
		transaction.commit();
		manager.close();
	}

	@Test
	public void testOneToOneRelationUniDirectional() {

		User user = new User("Alex", "Mahome", "amahome", 35, "mahome@email.com", null);
		Car c = new Car("Chevy", "Conaro", "2014", "Red Metallic");

		user.setCar(c);

		manager.persist(user);

		User dbUserObj = manager.find(User.class, user.getId());

		assertNotNull(dbUserObj);
		assertNotNull(dbUserObj.getCar());
		assertEquals(dbUserObj.getFirstName(), user.getFirstName());
		assertEquals(dbUserObj.getCar().getMake(), user.getCar().getMake());
	}

	@Test
	public void testOneToOneRelationBiDirectional() {

		User user = new User("Alex", "Mahome", "amahome", 35, "mahome@email.com", null);
		Car c = new Car("Chevy", "Conaro", "2014", "Red Metallic");

		c.setUser(user);
		user.setCar(c);

		manager.persist(user);
		User dbUserObj = manager.find(User.class, user.getId());
		Car dbCarObj = manager.find(Car.class, c.getId());

		assertNotNull(dbUserObj);
		assertNotNull(dbUserObj.getCar());
		assertEquals(dbUserObj.getFirstName(), user.getFirstName());
		assertEquals(dbUserObj.getCar().getMake(), user.getCar().getMake());

		assertNotNull(dbCarObj);
		assertNotNull(dbCarObj.getUser());
		assertEquals(dbCarObj.getMake(), c.getMake());
		assertEquals(dbCarObj.getUser().getFirstName(), c.getUser().getFirstName());

	}

}
