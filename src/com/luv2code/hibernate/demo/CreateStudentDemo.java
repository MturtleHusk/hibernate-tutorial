package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.cfgxml.internal.ConfigLoader;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			// use session obj to save java obj					
			// create student obj
			Student tempStudent = new Student("Paul", "Wall", "Paul@gmail.com");
			// begin transaction
			session.beginTransaction();
			// save student obj
			session.save(tempStudent);
			// end transmission
			session.getTransaction().commit();		
		}
		finally {
			factory.close();
		}
		
		
		
	}

}
