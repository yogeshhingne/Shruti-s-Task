package student.demo.pro.parcticePro.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
@Autowired
    public  Samosa samosa;
//
//    public Student(Samosa samosa) {
//        this.samosa=samosa;
//    }

    public  void study(){
        samosa.getSamosaPrise();
        System.out.println("Student is studying");
    }
}
