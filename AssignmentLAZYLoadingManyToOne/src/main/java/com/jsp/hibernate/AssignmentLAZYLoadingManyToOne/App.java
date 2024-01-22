package com.jsp.hibernate.AssignmentLAZYLoadingManyToOne;

import java.util.List;

//import java.util.Arrays;
//import java.util.List;

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
//		Teacher teacher1 = new Teacher();
//		teacher1.setTeacherId(143);
//		teacher1.setTeacherName("Kavitha");
//
//		/** if we do bi-directional list is needed */
//		//		List<Students> students1 = new Students();
//		Students students1 = new Students();
//		students1.setStudentId(111);
//		students1.setStudentName("Sridhar");
//
//		Students students2 = new Students();
//		students2.setStudentId(222);
//		students2.setStudentName("Dinesh");
//
//		students1.setTeacher(teacher1);
//		students2.setTeacher(teacher1);

		// teacher1.setStudents(Arrays.asList(students1, students2));

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Students.class)
				.addAnnotatedClass(Teacher.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

//		session.save(teacher1);
//		session.save(students1);
//		session.save(students2);

		/** Normal Fetching data Proces By SQL Query */
		/*
		 * Query<Students> query = session.createQuery("FROM Students"); List<Students>
		 * students = query.list();
		 * 
		 * for(Students s:students) { System.out.println(s); }
		 */

		/** Featching data processes by HQL Query */
		/**
		 * To featch the perticular data by HQL mean change the gendrics as String or
		 * Object
		 */

//		Query<Students> query = session.createQuery("SELECT s FROM Students s");
//		List<Students> students = query.list();
//
//		for (Students s : students) {
//			System.out.println(s);
//		}

		/** Update Dynamic data using HQL update Query */
//		Query<Vehicle> query = session.createQuery("UPDATE Vehicle v SET v.vehicleName=:vName WHERE v.vehicleId=:vId");
//		query.setParameter("vName", "bike");
//		query.setParameter("vId", 123);
//		int result = query.executeUpdate();
//		System.out.println(result);

		Query<Teacher> dQuery = session.createQuery("DELETE Teacher s WHERE s.studentId=:sId");
		dQuery.setParameter("sId", 222); 
		int res = dQuery.executeUpdate();
		System.out.println(res);

		/**
		 * If we are dealing with different type of data then we have to go for Object[]
		 */
		Query<Object[]> query = session.createQuery("SELECT s.studentName,s.studentId FROM Students s");
		List<Object[]> students = query.list();
		for (Object[] student : students) {
			for (Object object : student) {
				System.out.print(object + " ");
			}
			System.out.println();
		}

		transaction.commit();
		session.close();
	}
}