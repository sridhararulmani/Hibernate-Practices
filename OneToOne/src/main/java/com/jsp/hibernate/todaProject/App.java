package com.jsp.hibernate.todaProject;

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
		Persion p1 = new Persion();
		p1.setpId(101);
		p1.setpName("John");
		p1.setpContact(1324556);

		Persion p2 = new Persion();
		p2.setpId(102);
		p2.setpName("Dass");
		p2.setpContact(123456);

		Pan pan1 = new Pan();
		pan1.setP(p1);
		pan1.setPanId(1245);
		pan1.setPanNumber(34567);
		pan1.setPanCity("lA");

		Pan pan2 = new Pan();
		pan2.setP(p2);
		pan2.setPanId(3456);
		pan2.setPanNumber(87654);
		pan2.setPanCity("US");

		p1.setPan(pan1);
		p2.setPan(pan2);

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Persion.class)
				.addAnnotatedClass(Pan.class).buildSessionFactory();
		Session openSession = sf.openSession();
		Transaction tr = openSession.beginTransaction();

		openSession.save(p1);
		openSession.save(p2);
		openSession.save(pan1);
		openSession.save(pan2);

		tr.commit();
		openSession.close();
	}
}