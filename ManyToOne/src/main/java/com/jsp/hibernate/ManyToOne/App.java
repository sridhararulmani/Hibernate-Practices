package com.jsp.hibernate.ManyToOne;

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
		Company company1 = new Company();
		company1.setCompanyId(1);
		company1.setCompanyName("TCS");

		Employee employee1 = new Employee();
		employee1.setEmployeeId(120);
		employee1.setEmployeeName("Sridhar");
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(122);
		employee2.setEmployeeName("Dinesh");
		
		employee1.setCompany(company1);
		employee2.setCompany(company1);
		
		company1.getEmployees().add(employee1);
		company1.getEmployees().add(employee2);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Company.class)
				.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(employee1);
		session.save(employee2);
		session.save(company1);
		
		transaction.commit();
		session.close();
	}
}