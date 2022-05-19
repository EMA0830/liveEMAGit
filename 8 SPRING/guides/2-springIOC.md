:beginner: _**SPRING DEPENDENCIES**_  

```xml
  <properties>
  <!-- develop using 1.8 -->
 	<maven.compiler.source>1.8</maven.compiler.source>
 	<!-- class files to be compatible with jvm 1.8 -->
 	<maven.compiler.target>1.8</maven.compiler.target>
 	<spring.version>5.1.6.RELEASE</spring.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.7.0</version>
      <scope>test</scope>
    </dependency>
        <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <!-- <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency> -->
  </dependencies>
```
