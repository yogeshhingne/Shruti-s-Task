package student.demo.pro.parcticePro.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("student.demo.pro.parcticePro.annotationbasedconfiguration")
public class JavaConfig {
    @Bean
    public Samosa getSamosa(){
        return  new Samosa();
    }
//    Bean without using @Autowired
//    @Bean
//    public Student getBean(){
//       Student student= new Student(getSamosa());
//       return student;
//    }
    @Bean
public Student getBean(){
       Student student= new Student();
       return student;
    }
}

