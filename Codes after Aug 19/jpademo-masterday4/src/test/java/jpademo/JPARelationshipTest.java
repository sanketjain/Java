package jpademo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aitacs.jee.jpademo.entities.Book;
import com.aitacs.jee.jpademo.entities.Car;
import com.aitacs.jee.jpademo.entities.Project;
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

	@Test
	public void testOnetoManyRelationship() {
		User user = new User("Alex", "Mahome", "amahome", 35, "mahome@email.com", null);

		Book book = new Book();
		book.setName("Internet of Things");
		book.setAuthor("Manchurian Lal");

		/*
		 * List<Book> books = new ArrayList<Book>(); books.add(book);
		 * user.setBooks(books);
		 */

		user.getBooks().add(book);

		manager.persist(user);

		User dbUser = manager.find(User.class, user.getId());
		assertNotNull(dbUser);
		assertEquals(dbUser.getBooks().size(), 1);
		assertTrue(dbUser.getBooks().contains(book));

	}

	@Test
	public void testManyToOneRelationship() {
		User user = new User("Alex", "Mahome", "amahome", 35, "mahome@email.com", null);

		Book book = new Book();
		book.setName("Internet of Things");
		book.setAuthor("Manchurian Lal");

		user.getBooks().add(book);

		book.setUser(user);

		manager.persist(user);

		User dbUser = manager.find(User.class, user.getId());
		assertNotNull(dbUser);
		assertEquals(dbUser.getBooks().size(), 1);
		assertTrue(dbUser.getBooks().contains(book));

		Book dbBook = manager.find(Book.class, book.getBookId());
		assertNotNull(dbBook);
		assertNotNull(dbBook.getUser());
		assertTrue(dbBook.getUser().getId() == dbUser.getId());
	}
	
	@Test
	public void testManytoManyRelationship(){
		User user1 = new User("Alex", "Mahome", "amahome", 35, "mahome@email.com", null);
		User user2 = new User("Ted", "Jones", "tjones", 40, "tjones@email.com", null);

		Project project1 = new Project();
		project1.setProjectLead("Manchurian Lal");
		project1.setProjectName("Twitter App");
	
		Project project2 = new Project();
		project2.setProjectLead("Karthik K");
		project2.setProjectName("Time tracking app");

		user1.getProjects().add(project1);
		user1.getProjects().add(project2);
		
		user2.getProjects().add(project1);
		user2.getProjects().add(project2);
		
		manager.persist(user1);
		manager.persist(user2);
		
		//User dbUser2 = 
		
	}
}
	




