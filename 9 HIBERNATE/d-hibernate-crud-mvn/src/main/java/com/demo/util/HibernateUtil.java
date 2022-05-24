package com.demo.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	public static SessionFactory getSessionFactory() {
		// SESSION FACTORY
		Configuration configuration = new Configuration().configure();
		Properties properties = configuration.getProperties();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(properties);
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}	
}
