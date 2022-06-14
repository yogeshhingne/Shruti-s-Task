package student.demo.pro.parcticePro.dto.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {
    int id;
    String first_name;
    String last_name;
    String email;
    Date date;
}
