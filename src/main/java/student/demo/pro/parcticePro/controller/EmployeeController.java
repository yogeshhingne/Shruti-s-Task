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

    @PostMapping("employee")
    public ResponseEntity<EmployeeResponseDTO> saveEmp(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        Employee employee = modelMapper.map(employeeRequestDTO, Employee.class);
        Employee emp = employeeService.createEmp(employee);
        EmployeeResponseDTO employeeResponseDTO = modelMapper.map(emp, EmployeeResponseDTO.class);
        return new ResponseEntity<>(employeeResponseDTO, HttpStatus.CREATED);
    }


    //    @GET
//    @Produces(MediaType.TEXT_PLAIN)
    @GetMapping("Employee/any")
    public Employee getEmpID(@QueryParam("id") int id) {
        return employeeService.getById(id);
    }

    @GetMapping("Employee/any1")
    public Employee getEmpID1(@PathParam("id") int id) {
        return employeeService.getById(id);
    }

    @GetMapping("getAll")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmp();
    }
    @PutMapping("updateEmp/{id}")
    public Employee updateEmp(@RequestBody EmployeeRequestDTO employeeRequestDTO,@PathVariable int id){
      return employeeService.updateEmpById(employeeRequestDTO,id);
    }

}
