package com.jsp.hibernate.ManyToManyPractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.ManyToMany.Course;
import com.jsp.hibernate.ManyToMany.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Customer customer1=new Customer();
		customer1.setCustomerId(10);
		customer1.setCustomerName("Sridhar");
		
		Customer customer2=new Customer();
		customer2.setCustomerId(20);
		customer2.setCustomerName("Dinesh");
		
		Product product1=new Product();
		product1.setProductId(100);
		product1.setPtoductName("Sweet");
		
		Product product2=new Product();
		product2.setProductId(200);
		product2.setPtoductName("Karam");
		
		
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Product.class)
				.addAnnotatedClass(Customer.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
	}
}
