package com.jsp.hibernate.ManyToManyPrcatices;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerId(102);
		customer1.setCustomerName("Sri");

		Customer customer2 = new Customer();
		customer2.setCustomerId(103);
		customer2.setCustomerName("Dinesh");

		Product product1 = new Product();
		product1.setProductId(10);
		product1.setProductName("Gold");

		Product product2 = new Product();
		product2.setProductId(20);
		product2.setProductName("Silver");

		customer1.getProducts().add(product1);
		customer1.getProducts().add(product2);
		customer2.getProducts().add(product1);
		customer2.getProducts().add(product2);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Product.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(customer1);
		session.save(customer2);
		session.save(product1);
		session.save(product2);
		
		transaction.commit();
		session.close();
	}
}
