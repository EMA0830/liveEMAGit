:beginner: _**Hibernate**_  

:book: **setup**  

https://dev.mysql.com/downloads/file/?id=511553
user : root
password : mysql

:point_right: create database
```sql
CREATE DATABASE PRODUCTSDB;
```

:point_right: new java project  (d-hibernate-crud-nomvn)
- create lib folder
- add hibernate libraries (.jar)

:point_right: hibernate.cfg.xml  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
		<!-- oracle -->
		<!-- <property name="hibernate.connection.driver_class">oracle.jdbc.driver.OracleDriver</property> 
			<property name="hibernate.connection.url">jdbc:oracle:thin:@localhost:1521:xe</property> 
			<property name="hibernate.connection.username">hr</property> <property name="hibernate.connection.password">hr</property> 
			<property name="hibernate.dialect">org.hibernate.dialect.Oracle10gDialect</property> -->

		<!-- mysql -->
		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/PRODUCTSDB?useSSL=false</property>
		<property name="hibernate.connection.username">root</property>
		<property name="hibernate.connection.password">mysql</property>
		<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
		
		<property name="hibernate.hbm2ddl.auto">update</property>
		<property name="hibernate.show_sql">true</property>
		
		<mapping resource="com/demo/entity/Product.hbm.xml"/>
	</session-factory>
</hibernate-configuration>
```

:point_right: entity

```java
package com.demo.entity;

public class Product {
	private String productId;
	private String productName;
	private float price;
	public Product() {
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
}

```

:point_right: App

```java
package com.demo;

import java.util.List;
import java.util.Properties;

import org.hibernate.Query;
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
```
