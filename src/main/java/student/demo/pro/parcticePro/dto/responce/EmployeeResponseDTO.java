package student.demo.pro.parcticePro.dto.responce;

import lombok.*;
import student.demo.pro.parcticePro.entity.Address;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeResponseDTO {
    private Integer id;
    private String name;
    private Integer age;
    private Address address;
}