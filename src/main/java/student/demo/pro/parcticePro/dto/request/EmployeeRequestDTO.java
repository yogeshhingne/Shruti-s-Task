package student.demo.pro.parcticePro.dto.request;

import lombok.*;
import student.demo.pro.parcticePro.entity.Address;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeRequestDTO {
    private Integer id;
    private String name;
    private Integer age;
    private Address address;
}
