package com.hibernate.CURD.projectPractices;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Student std=new Student();
		std.setsId(101);
		std.setsName("virat");
		std.setsEmail("virat@gmail.com");
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();

		Transaction trans = ses.beginTransaction();

		ses.save(std);
		System.out.println(std);
		trans.commit();
		ses.close();
	}
}
