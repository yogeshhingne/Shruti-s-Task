package student.demo.pro.parcticePro;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import student.demo.pro.parcticePro.entity.Employee;
import student.demo.pro.parcticePro.repo.EmployeeRepo;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestCreateEmp {
    @LocalServerPort
    private int port;
    @Autowired
    EmployeeRepo employeeRepo;
    @BeforeEach
    void setUp() throws Exception {
       RestAssured.baseURI = "http://localhost:";
       RestAssured.port = 8080;
    }
    @Test
                final void testCreateEmployee(){
        Employee employee=dummyRecord();
        Response response=given().
                contentType("application/json").
                accept("application/json").
                body(employee).
                when().
                post(baseURI+port+"/employee").
                then().
                statusCode(201).
                contentType("application/json").
                extract().response();
        String name=response.jsonPath().getString("name");
        assertNotNull(name);

        }

        @Test
        final void testgetByID(){
            int  id=1;
            Response response=given().
                    contentType("application/json").
                    accept("application/json").
                    body(id).
                    when().
                    get(baseURI+port+"/Employee/any?id="+id).
                    then().
                    statusCode(200).
                    contentType("application/json").
                    extract().response();
            String name=response.jsonPath().getString("name");
            assertNotNull(name);
    }
    public static Employee dummyRecord() {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setAge(23);
        employee.setName("Hari");
        return employee;
    }
}

