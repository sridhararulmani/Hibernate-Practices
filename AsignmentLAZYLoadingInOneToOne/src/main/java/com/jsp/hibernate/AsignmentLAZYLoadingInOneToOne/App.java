package com.jsp.hibernate.AsignmentLAZYLoadingInOneToOne;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.setPersonId(101);
//		person1.setPersonName("Sridhar");
//
//		Person person2 = new Person();
//		person2.setPersonId(102);
//		person2.setPersonName("Dinesh");
//
//		Aadar aadar1 = new Aadar();
//		aadar1.setAadarId(5678943);
//		aadar1.setAadarAddress("jhgdsbnjh");
//
//		Aadar aadar2 = new Aadar();
//		aadar2.setAadarId(56787654);
//		aadar2.setAadarAddress("gfsdxcvfdgdsfb");
//
//		person1.setAadar(aadar1);
//		person2.setAadar(aadar2);
//
//		aadar1.setPerson(person1);
//		aadar2.setPerson(person2);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Person.class)
				.addAnnotatedClass(Aadar.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/** Featch the Data by proceesd by Normal Sql Query */
		Query<Aadar> query = session.createQuery("FROM Aadar");
		List<Aadar> aadars = query.list();
		for (Aadar a : aadars) {
			System.out.println(a);
		}
		/** Featch the Data by proceesd by HQL Query */
//		session.save(person1);
//		session.save(person2);
//		session.save(aadar1);
//		session.save(aadar2);

		transaction.commit();
		session.close();
	}
}
