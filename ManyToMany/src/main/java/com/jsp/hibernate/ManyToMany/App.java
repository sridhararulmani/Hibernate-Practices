package com.jsp.hibernate.ManyToMany;

import java.util.Arrays;

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
		Student student1 = new Student();
		student1.setStudentId(101);
		student1.setStudentName("Sridhar");

		Student student2 = new Student();
		student2.setStudentId(102);
		student2.setStudentName("Dinesh");

		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Java");

		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("Html");

		/**
		 * For Uni-Directional this implementation only is enough. Because here we
		 * connect one Class P.K into another Class P.K by this process
		 */
		// Uni-Directional
//		student1.getCourse().add(course1);
//		student1.getCourse().add(course2);
//		student2.getCourse().add(course1);
//		student2.getCourse().add(course2);
//
//		student1.setCourse(Arrays.asList(course1, course2));
//		student2.setCourse(Arrays.asList(course1, course2));
		/**
		 * For Bi-Directional both the implementations are required. Because here we
		 * connect one Class P.K into another Class P.K by this process
		 */
//		 Bi-Directional
		course1.getStudents().add(student1);
		course1.getStudents().add(student2);
		course2.getStudents().add(student1);
		course2.getStudents().add(student2);

//		course1.setStudents(Arrays.asList(student1, student2));
//		course2.setStudents(Arrays.asList(student1, student2));

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(student1);
		session.save(student2);
		session.save(course1);
		session.save(course2);

		transaction.commit();
		session.close();
	}
}
