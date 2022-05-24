:beginner: _**CRUD Hibernate**_  

:one: _mvn proj_  
```sh
 mvn archetype:generate 
 -DgroupId=com.demo 
 -DartifactId=d-hibernate-crud-mvn 
 -DarchetypeArtifactId=maven-archetype-quickstart 
 -DinteractiveMode=false
```
:two: _pom.xml_  
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.demo</groupId>
	<artifactId>demo-maven-java-project</artifactId>
	<packaging>jar</packaging>
	<version>1.0-SNAPSHOT</version>
	<name>demo-maven-java-project</name>
	<url>http://maven.apache.org</url>

	<properties>
		<!-- develop using 1.8 -->
		<maven.compiler.source>1.8</maven.compiler.source>
		<!-- class files to be compatible with jvm 1.8 -->
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>4.2.21.Final</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.29</version>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.7.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.7.0</version>
			<scope>test</scope>
		</dependency>
		<!-- <dependency> <groupId>junit</groupId> <artifactId>junit</artifactId> 
			<version>3.8.1</version> <scope>test</scope> </dependency> -->
	</dependencies>
	<build>
		<pluginManagement><!-- lock down plugins versions to avoid using Maven 
				defaults (may be moved to parent pom) -->
			<plugins>
				<!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
				<plugin>
					<artifactId>maven-clean-plugin</artifactId>
					<version>3.1.0</version>
				</plugin>
				<!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
				<plugin>
					<artifactId>maven-resources-plugin</artifactId>
					<version>3.0.2</version>
				</plugin>
				<plugin>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.8.0</version>
				</plugin>
				<plugin>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>2.22.1</version>
				</plugin>
				<plugin>
					<artifactId>maven-jar-plugin</artifactId>
					<version>3.0.2</version>
				</plugin>
				<plugin>
					<artifactId>maven-install-plugin</artifactId>
					<version>2.5.2</version>
				</plugin>
				<plugin>
					<artifactId>maven-deploy-plugin</artifactId>
					<version>2.8.2</version>
				</plugin>
				<!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
				<plugin>
					<artifactId>maven-site-plugin</artifactId>
					<version>3.7.1</version>
				</plugin>
				<plugin>
					<artifactId>maven-project-info-reports-plugin</artifactId>
					<version>3.0.0</version>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>
</project>

```
:three: _src/main/resources_  
- right click proj > new source folder > src/main/resources

:four: _hibernate.cfg.xml_  

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
		
		<mapping resource="Product.hbm.xml"/>
	</session-factory>
</hibernate-configuration>
```
:five: _mapping entity Product.hbm.xml_  
```xml
<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">
<!-- Generated 5 Mar, 2020 8:50:07 AM by Hibernate Tools 3.5.0.Final -->

<hibernate-mapping>
	<class name="com.demo.entity.Product" table="PRODUCTS">
		<id name="productId" type="java.lang.String">
			<column name="PRODUCT_ID" />
			<generator class="assigned" />
		</id>
		<property name="productName" type="java.lang.String">
			<column name="PRODUCT_NAME" />
		</property>

		<property name="price" type="java.lang.Float">
			<column name="PRICE" />
		</property>
	</class>
</hibernate-mapping>
```
:six: _Util_  
```java
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

```
:seven: _entity_  
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
:eight: _app_  
```java
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
```
