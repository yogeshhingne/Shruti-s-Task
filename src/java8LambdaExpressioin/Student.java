package java8LambdaExpressioin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {

    private int id;
    private String name;
    private float percentage;

    public Student(int id, String name, float percentage) {
        super();
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(18,"Ram",70f));
        list.add(new Student(10,"Sham",77f));
        list.add(new Student(16,"Hari",78f));
        list.add(new Student(8,"Om",100f));
//        Collections.sort(list,(p1,p2)->
//             p1.name.compareTo(p2.name)
//        );
//        System.out.println("sorting based on name :");
//        for (Student s:list
//             ) {
//            System.out.println(s.id+" "+s.name+" "+s.percentage);
//        }
        Stream<Student> data=list.stream().filter(p->p.percentage>75);
        data.forEach(stud-> System.out.println(stud.id+" "+" "+stud.name+" "+ stud.percentage));

    }
}
