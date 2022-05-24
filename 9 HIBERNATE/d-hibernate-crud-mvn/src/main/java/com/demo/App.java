package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Product;
import com.demo.util.HibernateUtil;


public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		//open session
		Session session = sessionFactory.openSession();
		// begin tran
		Transaction transaction = session.beginTransaction();
		
//		create entity
//		Product product = new Product();
//		product.setProductId("P02");
//		product.setProductName("ANGULAR");
//		product.setPrice(500);
//		session.save(product);
		
//		product = new Product();
//		product.setProductId("P03");
//		product.setProductName("java");
//		product.setPrice(500);
//		session.save(product);
		
	// update
//	Product product2 =	(Product)session.get(Product.class, "P02");
//	product2.setProductName("spring");
//	product2.setPrice(5000);
//	session.update(product2);
	
		//search
//		Product product2 =	(Product)session.get(Product.class, "P02");
//		System.err.println(product2);
		
		//delete product
//		Product product2 =	(Product)session.get(Product.class, "P03");
//		session.delete(product2);
		
//		get all
		Query query = session.createQuery("from Product");
		List<Product> productsList = query.list();
		productsList.forEach(System.out::println);
		
//      commit 
		transaction.commit();
		// close
		session.close();
	}

	
}