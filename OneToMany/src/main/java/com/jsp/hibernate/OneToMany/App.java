package com.jsp.hibernate.OneToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.setPersonId(101);
//		person1.setPersonName("Sri");
//		person1.setPersonContact(1234);
//
//		Person person2 = new Person();
//		person2.setPersonId(1234);
//		person2.setPersonName("Dinesh");
//		person2.setPersonContact(5678);
//
//		Vehicle vehicle1 = new Vehicle();
//		vehicle1.setVehicleId(123);
//		vehicle1.setVehicleName("Car");
//		vehicle1.setVehicleCost(9876);
//
//		Vehicle vehicle2 = new Vehicle();
//		vehicle2.setVehicleId(1234);
//		vehicle2.setVehicleName("Bike");
//		vehicle2.setVehicleCost(98765);
//
//		person1.getVehicles().add(vehicle1);
//		person2.getVehicles().add(vehicle2);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Person.class)
				.addAnnotatedClass(Vehicle.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

//		session.save(person1);
//		session.save(person2);
//		session.save(vehicle1);
//		session.save(vehicle2);

		/** To update data which is present in the dataBase */
//		Vehicle vehicle = session.get(Vehicle.class, 1234);
//		vehicle.setVehicleCost(123456);
//		session.saveOrUpdate(vehicle);

		/** Update Dynamic data using HQL update Query */
//		Query<Vehicle> query = session.createQuery("UPDATE Vehicle v SET v.vehicleName=:vName WHERE v.vehicleId=:vId");
//		query.setParameter("vName", "bike");
//		query.setParameter("vId", 123);
//		int result = query.executeUpdate();
//		System.out.println(result);
		/** one more way */
//		Query<Vehicle> query = session.createQuery("UPDATE Vehicle v SET v.vehicleName=?1 WHERE v.vehicleId=?2");
//		query.setParameter(1, "bike");
//		query.setParameter(2, 123);
//		int result = query.executeUpdate();
//		System.out.println(result);

		/** Delete Data using HQL query */
//		Query<Vehicle> query = session.createQuery("DELETE Vehicle v WHERE v.vehicleId=:vId");
//		query.setParameter("vId", 123);
//		int res = query.executeUpdate();
//		System.out.println(res);

		/** Feaching the datas by using SQL Query With the Help of NativeQuery(I) */
//		NativeQuery<Vehicle> nativeQuery = session.createNativeQuery("SELECT * FROM vehicle");
//		nativeQuery.addEntity(Vehicle.class);
//		List<Vehicle> vehicles = nativeQuery.list();
//		for(Vehicle vehicle:vehicles) {
//			System.out.println(vehicle);
//		}
//		NativeQuery<Person> nativeQuery2 = session.createNativeQuery("SELECT * FROM person");
//		nativeQuery2.addEntity(Person.class);
//		List<Person> persons= nativeQuery2.list();
//		for(Person person :persons) {
//			System.out.println(person);
//		}

		/** Update the data by using SQL Query with the Help of NativeQuery(I) */
//		NativeQuery<Person> nativeQuery = session.createNativeQuery("UPDATE person SET personName=? WHERE personId=?",
//				Person.class);
//		nativeQuery.setParameter(1, "Sridhar");
//		nativeQuery.setParameter(2, 101);
//		int res=nativeQuery.executeUpdate();
//		System.out.println(res);

		/** DELETE Data by using SQL Query with the Help of NativeQuery(I) */
		NativeQuery<Person> nativeQuery = session.createNativeQuery("DELETE person WHERE personId=?",
				Person.class);
		nativeQuery.setParameter(1, 101);
		int res = nativeQuery.executeUpdate();
		System.out.println(res);
		
		transaction.commit();
		session.close();
	}
}