:beginner: _**Maven**_  

- Maven is a build automation tool used primarily for Java projects.
- builds projects
- manages dependencies
- Maven projects are configured using a Project Object Model (POM), which is stored in a pom.xml-file. 

:computer: **Migrate our traditional java project to maven.**  

:one: _configure jdk source & target in pom.xml_  
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.demo</groupId>
  <artifactId>d1a-java-demos-maven</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <properties>
  <!-- develop using 1.8 -->
 	<maven.compiler.source>1.8</maven.compiler.source>
 	<!-- class files to be compatible with jvm 1.8 -->
 	<maven.compiler.target>1.8</maven.compiler.target>
  </properties>
</project>
```

:computer: **Create, Compile and Run Project with Maven**  

:one: _install maven_  
https://dlcdn.apache.org/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.zip
:two: _set maven home environmental variable_
start > env > add > MAVEN_HOME > C:\_software\_apache-maven-3.8.5-bin\apache-maven-3.8.5  
:three: _set maven bin to path_
start > env > add > PATH > C:\_software\_apache-maven-3.8.5-bin\apache-maven-3.8.5\bin  
:four: _check installation_  
```js
$ mvn --version
Apache Maven 3.8.5 
```
:five: _use mvn command to create_  
```sh
mvn archetype:generate -DgroupId=com.demo -DartifactId=demo-maven-java-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

```
:six: _configure pom for java 1.8 and compile project_
```sh
 mvn compile
```
:seven: _run project_  
```sh
 mvn exec:java -Dexec.mainClass=com.demo.App
```

:computer: **Manage dependencies**  
:one: _add JUnit dependency_  
```sh
<dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.7.0</version>
      <scope>test</scope>
    </dependency>
    <!-- <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency> -->
  </dependencies>
```
:two: _working detailed pom_  
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
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
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.7.0</version>
      <scope>test</scope>
    </dependency>
    <!-- <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency> -->
  </dependencies>
  <build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
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

:computer: **write tests**  

```java
package com.demo;

public class Calculator {
		// accepts two parameters (num1 and num2)
		public int add(int num1, int num2) {
			// returns the sum
			return num1+ num2;
		}
		public int subtract(int num1, int num2) {
			// returns the sum
			return num1 -  num2;
		}
}
package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;

public class CalculatorTest {
	Calculator calculatorObject;
	@BeforeEach
	public void setUp() {
		System.out.println("Setup");
		calculatorObject = new Calculator();
	}
	@Test
	public void testAdd() {
		System.out.println("testAdd");		
		assertEquals(15, calculatorObject.add(5, 10));
		assertNotEquals(150, calculatorObject.add(5, 10));
	}
	@Test
	public void testSutract() {
		System.out.println("testSutract");		
		assertEquals(-5, calculatorObject.subtract(5, 10));
		assertNotEquals(-150, calculatorObject.subtract(5, 10));
	}
@AfterEach
	public void tearDown() {
	System.out.println("tearDown");
		calculatorObject = null;
	}
}

```
 
:computer: **run tests**  

```java
mvn clean compile test
```
