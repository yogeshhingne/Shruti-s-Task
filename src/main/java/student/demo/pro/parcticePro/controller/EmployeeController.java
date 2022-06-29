package student.demo.pro.parcticePro.controller;

import okhttp3.OkHttpClient;
import org.hibernate.annotations.GeneratorType;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import student.demo.pro.parcticePro.dto.request.EmployeeRequestDTO;
import student.demo.pro.parcticePro.dto.responce.EmployeeResponseDTO;
import student.demo.pro.parcticePro.entity.Employee;
import student.demo.pro.parcticePro.service.CompletableFutureClass;
import student.demo.pro.parcticePro.service.EmployeeServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    @Autowired
    CompletableFutureClass completableFutureClass;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping("Employee")
    public String addEmployee() {
        return employeeService.threadCall();
    }

    @PostMapping("Emp")
    public CompletableFuture<String> addEmployee1() {
        return completableFutureClass.addEmp();

    }

    @PostMapping("employees")
    public ResponseEntity<EmployeeResponseDTO> saveEmp(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        EmployeeResponseDTO employeeResponseDTO=null;
       try{
           Employee employee = modelMapper.map(employeeRequestDTO, Employee.class);
           Employee emp = employeeService.createEmp(employee);
           employeeResponseDTO = modelMapper.map(emp, EmployeeResponseDTO.class);
           return ResponseEntity.of(Optional.of(employeeResponseDTO));
       }catch(Exception e){
           e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
    }


    //    @GET
//    @Produces(MediaType.TEXT_PLAIN)
    @GetMapping("Employee/any")
    public ResponseEntity<Employee> getEmpID(@QueryParam("id") int id) {
        Employee employee = null;
        try {
            employee = employeeService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.of(Optional.of(employee));
    }

    @GetMapping("Employee/any1")
    public Employee getEmpID1(@PathParam("id") int id) {
        return employeeService.getById(id);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> list = employeeService.getAllEmp();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("findBYName/{name}")
    public List<Employee> getEmpByName(@PathVariable String name) {
        return employeeService.getEmployeByName(name);
    }

    @PutMapping("updateEmp/{id}")
    public Employee updateEmp(@RequestBody EmployeeRequestDTO employeeRequestDTO, @PathVariable int id) {
        return employeeService.updateEmpById(employeeRequestDTO, id);
    }

    @GetMapping("empByNameAndUserName/{name}/{age}")
    public List<Employee> getEmpBYageAndName(@PathVariable String name, @PathVariable int age) {
        return employeeService.getEmpBYnameAndAge(name, age);
    }

    @GetMapping("employees")
    public List<Employee> getEmp() {
        return employeeService.getAllE();
    }
    @DeleteMapping("employees/{id}")
    public ResponseEntity<Void> deleteEmpByID(@PathVariable int id){
        try{
            employeeService.deleteEmployee(id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @PutMapping("employees/{id}")
    public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee,@PathVariable int id){
        try{
            employeeService.updateEmpByID(employee);
            return ResponseEntity.of(Optional.of(employee));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
