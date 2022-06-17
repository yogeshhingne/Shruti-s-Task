package service;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

@Service
public class ServicePro {
    @Autowired
    StudentRepository repository;
    public int sum(int a, int b){
        return a+b;
    }
    public Student createStudent(Student student){
        return repository.save(student);
    }
}
