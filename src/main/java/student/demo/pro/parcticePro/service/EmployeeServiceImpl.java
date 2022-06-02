package student.demo.pro.parcticePro.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import student.demo.pro.parcticePro.dto.request.EmployeeRequestDTO;
import student.demo.pro.parcticePro.dto.responce.EmployeeResponseDTO;
import student.demo.pro.parcticePro.entity.Employee;
import student.demo.pro.parcticePro.repo.EmployeeRepo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Configurable
public class EmployeeServiceImpl {


    @Autowired
    MyThread1 thread1;
    @Autowired
    MyThread2 thread2;
    @Autowired
    MyThread3 myThread3;
@Autowired
EmployeeRepo employeeRepo;
@Autowired
    ModelMapper modelMapper;
    public List<Employee> addEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
        BufferedReader br = null;
        String filePath = "C:\\EmplyeeList\\EmployeeData.txt";
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(filePath));
            while ((sCurrentLine = br.readLine()) != null) {
                String[] record = sCurrentLine.split(" ");
                Employee emp = new Employee();
                emp.setId(Integer.parseInt(record[0].trim()));
                emp.setName(record[1].trim());
                emp.setAge(Integer.parseInt(record[2].trim()));
                empList.add(emp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(empList);
        return empList;
    }

    public String threadCall() {
        thread1.start();
        thread2.start();
        myThread3.start();
        return "task done";
    }
    public Employee createEmp(Employee employee){
       return employeeRepo.save(employee);
    }
    public Employee getById(int id){
        return  employeeRepo.findById(id).get();
    }
    public  List<Employee> getAllEmp(){
      return  employeeRepo.findAll();
    }
    public Employee updateEmpById(EmployeeRequestDTO employeeRequestDTO,int id){
        Employee employee = employeeRepo.findById(id).get();
        employee.setId(employeeRequestDTO.getId());
        employee.setName(employeeRequestDTO.getName());
        employee.setAge(employeeRequestDTO.getAge());
       return employeeRepo.save(employee);

    }

}
