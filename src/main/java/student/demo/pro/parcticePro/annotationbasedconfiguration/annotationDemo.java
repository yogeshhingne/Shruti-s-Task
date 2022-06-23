package student.demo.pro.parcticePro.annotationbasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class annotationDemo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = context.getBean("getBean", Student.class);
        System.out.println(student);
        student.study();
    }
}
