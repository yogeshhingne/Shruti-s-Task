package dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private int id;
    private String name;
    private int age;
}
