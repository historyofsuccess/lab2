package university; 

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.supportClassPathXmlApplicationContext; 

@SpringBootApplication 
public class University { 
public static void main (String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext ( configLocation: "spring.xml");
      EduMinistry pub = (EduMinistry) context.getBean (string: "EduMinistry");
      System.out.println(x:pub.beststudent.toSting()); 

}
