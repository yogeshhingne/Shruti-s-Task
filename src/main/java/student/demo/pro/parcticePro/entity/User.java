package student.demo.pro.parcticePro.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name="user_tbl")
public class User
{
    @Id
    private int id;
    private String first_name;

    public User(int id, String first_name, String last_name, String email, Date date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.date = date;
    }

    private String last_name;
    private String email;
    private Date date;


    public User(int i, String yogesh, String hingne, String s) {
    }
}
