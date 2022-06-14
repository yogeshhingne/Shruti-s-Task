package student.demo.pro.parcticePro.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "user_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "first_name is mandatory")
    private String first_name;
    public User(int id, String first_name, String last_name, String email, Date date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.date = date;
    }
    @NotBlank(message = "last_name is mandatory")
    private String last_name;
    @NotBlank(message = "email is mandatory")
    private String email;
//    @NotBlank(message = "date is mandatory")
    private Date date;
    public User(int i, String yogesh, String hingne, String s) {
    }
}
