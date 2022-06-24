package student.demo.pro.parcticePro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import student.demo.pro.parcticePro.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public List<Employee> findByName(String name);
    //using JPQL Query
    @Query("select e from Employee e where e.name=:n and e.age=:a")
    public  List<Employee> findByUserNameAndEge(@Param("n") String name, @Param("a") int age);
    //Using native Query
    @Query(value = "select * from Employee", nativeQuery = true)
    public List<Employee> getAllEmplo();
}
