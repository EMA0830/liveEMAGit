:beginner: _**Eureka Server**_  

:one: _pom.xml_  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.6.8</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.demo</groupId>
	<artifactId>d1-micro-service-erueka-server-1</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>d1-micro-service-erueka-server-1</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>1.8</java.version>
		<spring-cloud.version>2021.0.3</spring-cloud.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

```
:two: _config props src\main\resources\application.properties_  
```sh
spring.application.name=eureka
server.port=8070
```
:three: _applicatoin.yml_  
```sh
eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false
```

:four: _app_  
```java
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class D1MicroServiceEruekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(D1MicroServiceEruekaServer1Application.class, args);
	}

}

```
