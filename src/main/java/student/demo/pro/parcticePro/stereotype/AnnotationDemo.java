package student.demo.pro.parcticePro.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
       ApplicationContext con=new ClassPathXmlApplicationContext("student/demo/pro/parcticePro/stereotype/config.xml");
        Student student = con.getBean("student", Student.class);
        System.out.println(student);
    }
}
