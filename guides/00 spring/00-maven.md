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
