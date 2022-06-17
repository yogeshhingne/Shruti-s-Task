package dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private int id;
    private String name;
    private int age;
}
