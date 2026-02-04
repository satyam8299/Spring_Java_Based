# Spring Java Based Configuration

## 📌 Overview
This project demonstrates **Spring Core using Java-based configuration**.
Bean definitions are created using `@Configuration` and `@Bean` annotations
instead of XML.

The application loads the Spring container using
`AnnotationConfigApplicationContext`.

---

## 🛠 Technologies Used
- Java
- Spring Framework (Core – Java Configuration)
- Eclipse IDE

---

## 📂 Project Structure
spring-java-based-configuration
├── src
│ ├── cs.bean
│ │ └── Stud.java
│ ├── cs.repo
│ │ └── Studrepo.java
│ └── cs.main
│ └── SpringJava.java
├── lib
│ ├── spring-core.jar
│ ├── spring-beans.jar
│ ├── spring-context.jar
│ ├── spring-expression.jar
│ └── commons-logging.jar
├── .classpath
├── .project
└── README.md


---

## 📸 Output Screenshot

Below is the output generated after running the Java-based configuration project:

![Application Output](screenshots/output.png)



---

## ⚙️ Configuration Details
- `@Configuration` is used to define configuration class
- `@Bean` is used to define Spring beans
- No XML configuration is used

Example:
```java
@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student();
    }
}


## 👨‍💻 Author
**Satyam Singh**  
Java Developer
