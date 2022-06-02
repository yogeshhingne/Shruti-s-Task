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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_tbl")
public class User
{
    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private Date date;
}
