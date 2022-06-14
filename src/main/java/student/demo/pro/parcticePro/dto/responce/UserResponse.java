package student.demo.pro.parcticePro.dto.responce;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {
    int id;
    String first_name;
    String last_name;
    String email;
    Date date;
}
