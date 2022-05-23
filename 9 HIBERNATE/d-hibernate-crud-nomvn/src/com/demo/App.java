package com.demo;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.demo.entity.Product;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = getSessionFactory();
		//open session
		Session session = sessionFactory.openSession();
		// begin tran
		Transaction transaction = session.beginTransaction();
//		create entity
		Product product = new Product();
		product.setProductId("P02");
		product.setProductName("ANGULAR");
		product.setPrice(500);
		session.save(product);
//      commit 
		transaction.commit();
		// close
		session.close();
	}

	private static SessionFactory getSessionFactory() {
		// SESSION FACTORY
		Configuration configuration = new Configuration().configure();
		Properties properties = configuration.getProperties();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(properties);
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}	
}