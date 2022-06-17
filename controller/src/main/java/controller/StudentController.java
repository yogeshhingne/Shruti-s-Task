package controller;

import dto.StudentRequest;
import dto.StudentResponse;
import entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.ServicePro;
@RestController
public class StudentController {
    @Autowired
    ServicePro servicePro;
    @Autowired
    ModelMapper modelMapper;
//    public static void main(String[] args) {
//        ServicePro servicePro=new ServicePro();
//        System.out.println(servicePro.sum(10,10));
//    }
    @GetMapping("/sum")
    public String getResult(){
        servicePro.sum(12,5);
        System.out.println(servicePro.sum(12,5));
        return "done";
    }
    @PostMapping("/insert")
    public ResponseEntity<StudentResponse> insertStudent(@RequestBody StudentRequest studentRequest){
        Student student=modelMapper.map(studentRequest,Student.class);
        Student student1=servicePro.createStudent(student);
        StudentResponse studentResponse=modelMapper.map(student1,StudentResponse.class);
        return new ResponseEntity<>(studentResponse,HttpStatus.OK);
    }
}
