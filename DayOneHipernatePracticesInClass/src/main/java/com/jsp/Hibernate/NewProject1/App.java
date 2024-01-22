package com.jsp.Hibernate.NewProject1;

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
		Employee e1 = new Employee();
		e1.setEmployeeId(101);
		e1.setEmployeeName("john");
		e1.setEmployeeSalary(5000);

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);

		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(e1);
		trans.commit();
		session.close();

	}
}